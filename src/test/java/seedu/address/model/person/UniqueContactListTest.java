package seedu.address.model.person;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static seedu.address.logic.commands.CommandTestUtil.VALID_ADDRESS_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_TAG_HUSBAND;
import static seedu.address.testutil.Assert.assertThrows;
import static seedu.address.testutil.TypicalContacts.ALICE;
import static seedu.address.testutil.TypicalContacts.BOB;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

import seedu.address.model.person.exceptions.DuplicatePersonException;
import seedu.address.model.person.exceptions.PersonNotFoundException;
import seedu.address.testutil.ContactBuilder;

public class UniqueContactListTest {

    private final UniqueContactList uniqueContactList = new UniqueContactList();

    @Test
    public void contains_nullContact_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> uniqueContactList.contains(null));
    }

    @Test
    public void contains_contactNotInList_returnsFalse() {
        assertFalse(uniqueContactList.contains(ALICE));
    }

    @Test
    public void contains_contactInList_returnsTrue() {
        uniqueContactList.add(ALICE);
        assertTrue(uniqueContactList.contains(ALICE));
    }

    @Test
    public void contains_contactWithSameIdentityFieldsInList_returnsTrue() {
        uniqueContactList.add(ALICE);
        Contact editedAlice = new ContactBuilder(ALICE).withAddress(VALID_ADDRESS_BOB).withTags(VALID_TAG_HUSBAND)
                .build();
        assertTrue(uniqueContactList.contains(editedAlice));
    }

    @Test
    public void add_nullContact_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> uniqueContactList.add(null));
    }

    @Test
    public void add_duplicateContact_throwsDuplicateContactException() {
        uniqueContactList.add(ALICE);
        assertThrows(DuplicatePersonException.class, () -> uniqueContactList.add(ALICE));
    }

    @Test
    public void setContact_nullTargetContact_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> uniqueContactList.setPerson(null, ALICE));
    }

    @Test
    public void setContact_nullEditedContact_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> uniqueContactList.setPerson(ALICE, null));
    }

    @Test
    public void setContact_targetContactNotInList_throwsContactNotFoundException() {
        assertThrows(PersonNotFoundException.class, () -> uniqueContactList.setPerson(ALICE, ALICE));
    }

    @Test
    public void setContact_editedContactIsSameContact_success() {
        uniqueContactList.add(ALICE);
        uniqueContactList.setPerson(ALICE, ALICE);
        UniqueContactList expectedUniqueContactList = new UniqueContactList();
        expectedUniqueContactList.add(ALICE);
        assertEquals(expectedUniqueContactList, uniqueContactList);
    }

    @Test
    public void setContact_editedContactHasSameIdentity_success() {
        uniqueContactList.add(ALICE);
        Contact editedAlice = new ContactBuilder(ALICE).withAddress(VALID_ADDRESS_BOB).withTags(VALID_TAG_HUSBAND)
                .build();
        uniqueContactList.setPerson(ALICE, editedAlice);
        UniqueContactList expectedUniqueContactList = new UniqueContactList();
        expectedUniqueContactList.add(editedAlice);
        assertEquals(expectedUniqueContactList, uniqueContactList);
    }

    @Test
    public void setContact_editedContactHasDifferentIdentity_success() {
        uniqueContactList.add(ALICE);
        uniqueContactList.setPerson(ALICE, BOB);
        UniqueContactList expectedUniqueContactList = new UniqueContactList();
        expectedUniqueContactList.add(BOB);
        assertEquals(expectedUniqueContactList, uniqueContactList);
    }

    @Test
    public void setContact_editedContactHasNonUniqueIdentity_throwsDuplicateContactException() {
        uniqueContactList.add(ALICE);
        uniqueContactList.add(BOB);
        assertThrows(DuplicatePersonException.class, () -> uniqueContactList.setPerson(ALICE, BOB));
    }

    @Test
    public void remove_nullContact_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> uniqueContactList.remove(null));
    }

    @Test
    public void remove_contactDoesNotExist_throwsContactNotFoundException() {
        assertThrows(PersonNotFoundException.class, () -> uniqueContactList.remove(ALICE));
    }

    @Test
    public void remove_existingContact_removesContact() {
        uniqueContactList.add(ALICE);
        uniqueContactList.remove(ALICE);
        UniqueContactList expectedUniqueContactList = new UniqueContactList();
        assertEquals(expectedUniqueContactList, uniqueContactList);
    }

    @Test
    public void setContacts_nullUniqueContactList_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> uniqueContactList.setPersons((UniqueContactList) null));
    }

    @Test
    public void setContacts_uniqueContactList_replacesOwnListWithProvidedUniqueContactList() {
        uniqueContactList.add(ALICE);
        UniqueContactList expectedUniqueContactList = new UniqueContactList();
        expectedUniqueContactList.add(BOB);
        uniqueContactList.setPersons(expectedUniqueContactList);
        assertEquals(expectedUniqueContactList, uniqueContactList);
    }

    @Test
    public void setContacts_nullList_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> uniqueContactList.setPersons((List<Contact>) null));
    }

    @Test
    public void setContacts_list_replacesOwnListWithProvidedList() {
        uniqueContactList.add(ALICE);
        List<Contact> contactList = Collections.singletonList(BOB);
        uniqueContactList.setPersons(contactList);
        UniqueContactList expectedUniqueContactList = new UniqueContactList();
        expectedUniqueContactList.add(BOB);
        assertEquals(expectedUniqueContactList, uniqueContactList);
    }

    @Test
    public void setContacts_listWithDuplicateContacts_throwsDuplicateContactException() {
        List<Contact> listWithDuplicateContacts = Arrays.asList(ALICE, ALICE);
        assertThrows(DuplicatePersonException.class, () -> uniqueContactList.setPersons(listWithDuplicateContacts));
    }

    @Test
    public void asUnmodifiableObservableList_modifyList_throwsUnsupportedOperationException() {
        assertThrows(UnsupportedOperationException.class, ()
            -> uniqueContactList.asUnmodifiableObservableList().remove(0));
    }

    @Test
    public void toStringMethod() {
        assertEquals(uniqueContactList.asUnmodifiableObservableList().toString(), uniqueContactList.toString());
    }
}
