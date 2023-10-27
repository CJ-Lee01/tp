package seedu.address.storage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import seedu.address.commons.exceptions.IllegalValueException;
import seedu.address.model.contact.Address;
import seedu.address.model.contact.Contact;
import seedu.address.model.contact.Email;
import seedu.address.model.contact.Id;
import seedu.address.model.contact.Name;
import seedu.address.model.contact.Organization;
import seedu.address.model.contact.Phone;
import seedu.address.model.contact.Position;
import seedu.address.model.contact.Recruiter;
import seedu.address.model.contact.Status;
import seedu.address.model.contact.Type;
import seedu.address.model.contact.Url;
import seedu.address.model.jobapplication.JobApplication;
import seedu.address.model.tag.Tag;


/**
 * Jackson-friendly version of {@link Contact}.
 */
class JsonAdaptedContact {

    public static final String MISSING_FIELD_MESSAGE_FORMAT = "Contact's %s field is missing!";

    private final String type;
    private final String name;
    private final String phone;
    private final String email;
    private final String address;
    private String status;
    private String position;
    private final String id;
    private final String url;
    private String oid;
    private final List<JsonAdaptedTag> tags = new ArrayList<>();
    private final List<JsonAdaptedApplication> applications = new ArrayList<>();


    /**
     * Constructs a {@code JsonAdaptedContact} with the given contact details.
     */
    @JsonCreator
    public JsonAdaptedContact(@JsonProperty("type") String type,
                              @JsonProperty("name") String name, @JsonProperty("id") String id,
                              @JsonProperty("phone") String phone, @JsonProperty("email") String email,
                              @JsonProperty("url") String url, @JsonProperty("address") String address,
                              @JsonProperty("status") String status, @JsonProperty("position") String position,
                              @JsonProperty("oid") String oid, @JsonProperty("tags") List<JsonAdaptedTag> tags,
                              @JsonProperty("applications") List<JsonAdaptedApplication> applications) {
        this.type = type;
        this.name = name;
        this.id = id;
        this.phone = phone;
        this.email = email;
        this.url = url;
        this.address = address;
        this.status = status;
        this.position = position;
        this.oid = oid;
        if (tags != null) {
            this.tags.addAll(tags);
        }
        if (applications != null) {
            this.applications.addAll(applications);
        }
    }

    /**
     * Constructs a {@code JsonAdaptedContact} with the given contact details.
     */
    public JsonAdaptedContact(@JsonProperty("type") String type,
                              @JsonProperty("name") String name, @JsonProperty("id") String id,
                              @JsonProperty("phone") String phone, @JsonProperty("email") String email,
                              @JsonProperty("url") String url, @JsonProperty("address") String address,
                              @JsonProperty("status") String status, @JsonProperty("position") String position,
                              @JsonProperty("oid") String oid, @JsonProperty("tags") List<JsonAdaptedTag> tags) {
        this(type, name, id, phone, email, url, address, status, position, oid, tags, null);
    }
    /**
     * Converts a given {@code Contact} into this class for Jackson use.
     */
    public JsonAdaptedContact(Contact source) {
        if (source.getType() == Type.ORGANIZATION) {
            Organization organization = (Organization) source;
            status = organization.getStatus()
                    .map(status -> status.applicationStatus)
                    .orElse(null);
            position = organization.getPosition()
                    .map(position -> position.jobPosition)
                    .orElse(null);
            oid = "";
        } else if (source.getType() == Type.RECRUITER) {
            Recruiter recruiter = (Recruiter) source;
            status = "";
            position = "";
            oid = recruiter.getOrganizationId()
                    .map(oid -> oid.value)
                    .orElse(null);
        }

        type = source.getType().toString();
        name = source.getName().fullName;
        id = source.getId().value;
        phone = source.getPhone().map(phone -> phone.value).orElse(null);
        email = source.getEmail().map(email -> email.value).orElse(null);
        url = source.getUrl().map(url -> url.value).orElse(null);
        address = source.getAddress().map(address -> address.value).orElse(null);
        tags.addAll(source.getTags().stream()
                .map(JsonAdaptedTag::new)
                .collect(Collectors.toList()));
        if (source.getType() == Type.ORGANIZATION) {
            Organization org = (Organization) source;
            List<JobApplication> applicationList = Arrays.asList(org.getJobApplications());
            applications.addAll(applicationList.stream()
                    .map(JsonAdaptedApplication::new)
                    .collect(Collectors.toList()));
        }
    }


    /**
     * Converts this Jackson-friendly adapted contact object into the model's {@code Contact} object.
     *
     * @throws IllegalValueException if there were any data constraints violated in the adapted contact.
     */
    public Contact toModelType() throws IllegalValueException {
        final List<Tag> contactTags = new ArrayList<>();
        for (JsonAdaptedTag tag : tags) {
            contactTags.add(tag.toModelType());
        }

        // Type#fromString implicitly returns UNKNOWN if type is null. May change if UNKNOWN is removed in the future.
        final Type modelType = Type.fromString(type);

        if (name == null) {
            throw new IllegalValueException(String.format(MISSING_FIELD_MESSAGE_FORMAT, Name.class.getSimpleName()));
        }
        if (!Name.isValidName(name)) {
            throw new IllegalValueException(Name.MESSAGE_CONSTRAINTS);
        }
        final Name modelName = new Name(name);

        if (id == null) {
            throw new IllegalValueException(String.format(MISSING_FIELD_MESSAGE_FORMAT, Id.class.getSimpleName()));
        }
        if (!Id.isValidId(id)) {
            throw new IllegalValueException(Id.MESSAGE_CONSTRAINTS);
        }
        final Id modelId = new Id(id);

        if (phone != null && !Phone.isValidPhone(phone)) {
            throw new IllegalValueException(Phone.MESSAGE_CONSTRAINTS);
        }
        final Phone modelPhone = phone == null ? null : new Phone(phone);

        if (email != null && !Email.isValidEmail(email)) {
            throw new IllegalValueException(Email.MESSAGE_CONSTRAINTS);
        }
        final Email modelEmail = email == null ? null : new Email(email);

        if (url != null && !Url.isValidUrl(url)) {
            throw new IllegalValueException(Url.MESSAGE_CONSTRAINTS);
        }
        final Url modelUrl = url == null ? null : new Url(url);

        if (address != null && !Address.isValidAddress(address)) {
            throw new IllegalValueException(Address.MESSAGE_CONSTRAINTS);
        }
        final Address modelAddress = address == null ? null : new Address(address);

        final Set<Tag> modelTags = new HashSet<>(contactTags);

        switch (modelType) {
        case ORGANIZATION: {
            final Set<Id> modelRids = new HashSet<>();

            if (status != null && !Status.isValidStatus(status)) {
                throw new IllegalValueException(Status.MESSAGE_CONSTRAINTS);
            }
            final Status modelStatus = status == null ? new Status() : new Status(status);

            if (position != null && !Position.isValidPosition(position)) {
                throw new IllegalValueException(Position.MESSAGE_CONSTRAINTS);
            }
            final Position modelPosition = position == null ? new Position() : new Position(position);

            return new Organization(
                    modelName, modelId, modelPhone, modelEmail, modelUrl, modelAddress,
                    modelTags, modelStatus, modelPosition, modelRids
            );
        }
        case RECRUITER: {
            if (oid != null && !Id.isValidId(oid)) {
                throw new IllegalValueException(Id.MESSAGE_CONSTRAINTS);
            }
            final Id modelOid = oid == null ? null : new Id(oid);

            return new Recruiter(
                    modelName, modelId, modelPhone, modelEmail, modelUrl, modelAddress,
                    modelTags, modelOid
            );
        }
        default:
            return new Contact(modelName, modelId, modelPhone, modelEmail, modelUrl, modelAddress, modelTags);
        }
    }

}
