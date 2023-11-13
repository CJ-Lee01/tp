<div class="reset-page-break-defaults" markdown="1">


---
layout: page
title: User Guide
---



--------------------------------------------------------------------------------------------------------------------
## Introduction

  Welcome to the **Jobby** User Guide!

  **Jobby** is a **desktop app designed for Computer Science students looking for a systematic way to manage their job applications and networking contacts, optimized for use via a Command Line Interface (CLI)** while still having the benefits of a Graphical User Interface (GUI). Jobby can help you manage tracking your job applications and contacts in a more streamlined fashion. If you can type fast, Jobby can get your contact management tasks done faster than traditional GUI apps.

  It is assumed that you know how the job application process is like, and that you know how to look for job applications.

### Purpose of this guide

  The purpose of this guide is to get you familiar with the features of **Jobby** - from the very basics, to the most advanced features the application has to offer. These features range from the simple task of adding an contacts into the application for tracking to how our application can assist you in tracking every steps of your application process. We will go through every feature **Jobby** has to offer within this guide. You can check out the Table of Contents to navigate to a feature you might be interested in using.

### How to use this guide

  _(For users who just want to see the table of contents, click [here](#table-of-contents).)_  

  To begin using this guide, ensure you have [installed Jobby](#installation). 
  Once this is done, go to the [tutorial](#jobby-tutorial--for-new-users-) section to get started on the basic features of Jobby. 
  
  When you become more familiar with the basic features, you can move on to understand [how Jobby's commands are structured and how to use autocomplete to your advantage](#using-jobby). 
  
  Afterwards, please feel free to go through the [features section](#features) to find out what features Jobby has installed. We recommend going through it in the order of this guide but any order works as well! You may check out our table of contents to jump to any section of your choice.

  _The different symbols and formats used are explained in [this section](#navigating-the-guide)._

  _The summary of the commands can be found [here](#command-summary)._

</div>

--------------------------------------------------------------------------------------------------------------------

## Table of contents
* Table of Contents
{:toc}

## Installation

1. Ensure you have _Java 11_ or above installed in your computer.
   * Download Java [here](https://www.oracle.com/java/technologies/downloads/)
   * How to check your Java version on [Windows](https://www.howtogeek.com/717330/how-to-check-your-java-version-on-windows-10/), [macOS](https://www.wikihow.com/Check-Java-Version-on-a-Mac), and [Linux](https://stackoverflow.com/questions/47627270/how-to-check-java-version-at-linux-redhat6). 

1. Download the latest _jobby.jar_ from [here](https://github.com/AY2324S1-CS2103T-W08-3/tp/releases).

1. Copy the file to the folder you want to use as the _home folder_ for your Jobby Application.

1. Open a command terminal, navigate into the folder you put the jar file in, and enter `java -jar jobby.jar` in the terminal to run the application.<br>
   A window similar to the below should appear in a few seconds. Notice that the app contains some sample data.<br>
   * If you do not know how to navigate to your folder in the terminal, check out these links for [Windows](https://www.howtogeek.com/659411/how-to-change-directories-in-command-prompt-on-windows-10/), [macOS](https://appletoolbox.com/navigate-folders-using-the-mac-terminal/), and [Linux](https://askubuntu.com/questions/232442/how-do-i-navigate-between-directories-in-terminal).
  ![Ui](images/Ui.png)

1. Type a command in the command box and press Enter to execute it - e.g., typing `help` and pressing Enter will open the help window.<br>

1. Refer to the [Features](#features) below for details of each command.

--------------------------------------------------------------------------------------------------------------------

## Navigating the Guide


### Code blocks for entering commands

<code> </code> &nbsp; denotes a command or a part of a command that can be entered in Jobby. For example, `add --org --name Woogle` is a command. `add` is also part of a command.

### Small information pills

| Component                                                                                                                                                                     | Description                                                                                                                                                                                                                                                                                                           |
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| <span class="learning-outcome pill">:trophy: Learning outcomes</span>                                                                                                         | The learning outcome of the section.                                                                                                                                                                                                                                                                                  |
| <span class="beginner pill">Beginner</span><br><span class="intermediate pill">Intermediate</span><br><span class="expert pill">Expert</span>                                 | The difficulty level of the section, with <span class="beginner pill">Beginner</span> for new users, <span class="intermediate pill">Intermediate</span> for users who have completed the tutorial, and <span class="expert pill">Expert</span> for users who have completed and used the features in the User Guide. |
| <span class="information pill">:information_source: An info pill</span>                                                                                                       | Contains some additional information, such as assumptions and useful information.                                                                                                                                                                                                                                     |
| <span class="warning pill">:warning: Some warning</span>                                                                                                                      | Contains a short warning regarding the use of a feature.                                                                                                                                                                                                                                                              |
| <span class="danger pill">:warning: A danger pill</span>                                                                                                                      | Contains a short danger message regarding the use of a feature.                                                                                                                                                                                                                                                       |
| <span class="jobby-data-class pill">Organization</span><br><span class="jobby-data-class pill">Recruiter</span><br><span class="jobby-data-class pill">Job Application</span> | The different objects of interest in Jobby: Organizations, Recruiters and Job Applications.                                                                                                                                                                                                                           |
| <span class="applies-to pill"><span class="jobby-data-class pill">Organization</span></span>                                                                                  | Contains information on which objects of interest in Jobby the feature can be used on.                                                                                                                                                                                                                                |

### Large information sections

<div markdown="block" class="alert alert-info">
:bulb: This is a blue box. It can be used for additional tips or more useful information.
</div>

<div markdown="block" class="alert alert-warning">
:warning: This is a warning box. It can be used to give more details on the warnings and limitations of features.
</div>

--------------------------------------------------------------------------------------------------------------------
## Navigating the Interface

Jobby comes equipped with a [GUI]() interface that provides visual feedback to you. Below is a quick overview of the various components of our interface.

![ui overview](images/ug-images/labelled-gui.png)

| Component           | Description                                                                                                |
|---------------------|------------------------------------------------------------------------------------------------------------|
| Command Box         | You will enter your [commands](#glossary) along with its input here.                                       |
| Result Display      | Displays the results of your commands.<br/>Any error messages will also be displayed here.                 |
| Contact Details     | Contains information related to the [contact](#glossary) like name, phone number, email etc.               |
| Application Details | Contains information related to the [internship application](#glossary) details like status, deadline etc. |


--------------------------------------------------------------------------------------------------------------------
## Jobby Tutorial (for new users)

Hello and welcome to Jobby! We are delighted that you've chosen our platform to manage your internship application process!

Before we begin, please ensure that you have viewed the following sections of the guide:
* [Quick Start]() to help you get Jobby up and running
* [Navigating the Interface]() to get you familiarised with navigating Jobby

This tutorial aims to guide you through the most essential features and functionalities of Jobby that you will use on a day-to-day
basis. In this guide, you will learn how to add your first tutor and corresponding schedule!

Click on any of the hyperlinks below to jump to respective sections of the tutorial!
* Beginning
* Adding your first contact
* Adding your first application

Jobby comes equipped with a [GUI]() interface that provides visual feedback to you. Below is a quick overview of the various components of our interface.

![ui overview](images/ug-images/labelled-gui.png)

### Adding `Contact`
Jobby can create `Contacts`. In the form of `Organization` and `Recruiter`, which you can add into your database with simple CLI commands.

Let's say you want to track your job application for the `Organization: Woogle`, with a `Recruiter: John`.

You can add the `Organization` into Jobby with a simple command:
```add --org --name Woogle --id woogle_id```

![Add Organization](images/starter-guide/add-woogle.jpg)


You can then add a **recruiter** that's related to the "Woogle" organization like so::
```add --rec --name John --id john_id --oid woogle_id```

![Add Recruiter](images/starter-guide/add-john.jpg)


> To find out all of `Organization` and `Recruiter`'s flags, go [organization documentation]()
> and [recruiter documentation]()

### Adding `Application`
Let's say now you want to apply to `Woogle` for the position of `Junior Software Engineer` role. You will be able to create
an `Application` for this company with the by including the `Organization ID` in the command:
`apply woogle_id --title Software Engineer --by 22-11-2023`

![Add Application](images/starter-guide/add-application.jpg)

`Application` will automatically generates the fields if there are no inputs on your end.
- `Status: Pending`
- `Stage: Resume`

> You will be able to add different details of `Application`, see the [applcation documentation]() here.

### Editing `Contact`
Now that you have both your Contacts and Applications. You received new informations about your `Contacts`, you will have to edit your `Contact` data.

We can do so with the `edit` CLI command with the desired id and input.

Let's say we want to change the phone detail of `Organization: Woogle` and email of `Recruiter: John`.
We can use the commands:
`edit woogle_id --phone 12345678` and `edit john_id --email john@gmail.com`

![Edit Contact](images/starter-guide/edit-john.jpg)


After executing the commands,
`Organization: Woogle`'s number changed to `phone: 12345678`.
`Recruiter: John`'s email changed to `Email: john@gmail.com`.

> To find more ways to `edit` `Organization` and `Recruiter`, see the [edit documentation](LINK TO ORGANIZATION AND RECRUITER DOCUMENTATION)

### Editing `Application`
For your `Woogle` application, you managed to pass the resume screening stage! And you will have to change your `Stage` to
the `Interview` stage.

You will be able to do it simply with:
`edit --application 5 --stage interview`

![edit application](images/starter-guide/edit-application.jpg)


This will change your `Stage` from `Resume` to `Interview`, indicating that you are onto the next stage of the application process.
> To find more fields of the `Application` to edit, see the [edit documentation](LINK TO EDIT APPLICATION DOCUMENTATION)

### Get `Reminder`
During your internship application process, you might feel that there are many deadlines that you have to keep track of,
in Jobby, we have a `Remind` command that will help you sort your applications by their `Deadlines`.

You can do so with a simple command:
`remind --earliest`
to see your application deadlines from the earliest to latest.

![Remind Earliest](images/starter-guide/remind-earliest.jpg)


> To find out more ways to use `remind`, see the [remind documentation](LINK TO REMIND DOCUMENTATION).

### Finding `Organization` and its related `Applications
Let's say there is a specific organization application you are looking for, like **Woogle**, you will be able to easily find it via
this command:
```
find woogle
```

SCREENSHOT

> To find out more ways to use `find`, see the [find documentation](LINK TO find DOCUMENTATION).




![List](images/starter-guide/list.jpg)




--------------------------------------------------------------------------------------------------------------------

## Using Jobby

This section explains the details of how we can interact with Jobby.

If you're looking for the list of available commands, check out the [Features](#features) section instead.

### Command Structure

<span class="learning-outcome pill">:trophy: How to understand and write Jobby commands</span> <span class="beginner pill">Beginner</span>

In Jobby, we write commands in the command box at the top of Jobby's window.

Commands are made up of a few parts: The **command**, **parameter names** and **input values**.

A command like "`edit google --name Google SG --id google-sg`" would refer to:
* the **command** `edit`,
* with a **command value** `google`,
* with a **parameter** `--name`,
  * which has the **parameter value** `Google SG`,
* with a **parameter** `--id`,
  * which has the **parameter value** `google-sg`.

Parameters may be in any order, whose names are of the form `-a` or `--abc123`, and must be surrounded by whitespace.

Any extra parameters and values to commands that don't accept them will either be ignored or throw an error.

<div markdown="block" class="alert alert-info">

**:bulb: Additional information:**<br>

* Parameter names are restricted to the `-`/`--` prefix, contain only letters and numbers, and must begin with a letter.

* Any parameter names not following the required format will be treated as data input, so an input like *"-5 degrees"* will work.

* Although Jobby's syntax resembles the usual Unix syntax, you should not quote your text, and you should not leave a trailing `=`.

</div>

### Command Explanations

<span class="learning-outcome pill">:trophy: How to interpret this guide's command explanations</span> <span class="beginner pill">Beginner</span>

Throughout this guide, you will find symbols and placeholders used to describe a command format. They are:

* **Words in `UPPER_CASE`**

  * The parts where you should be typing your parameter values.

  * e.g., `--name NAME` means inputting names along the lines of `--name Alice`.

* **Terms separated by `/` or `|`**

  * Exactly one of the given options.

  * These may be included in the parameter names or value description.

  * e.g., `--a/--b` means either `--a` or `--b` but not `--a --b`.

* **Terms surrounded by `[` and `]`**

  * An optional parameter or option that may be omitted.

  * e.g., `[--id ID]` means you may omit setting an ID for the command.

* **Terms ending with `...`**

  * The parameter is multivalued.

  * e.g., `[--tag TAG]...` means `--tag` and its value can be repeated from 0 to any number of times.



### Command Autocomplete

<span class="learning-outcome pill">:trophy: How to use Jobby's command autocompletion</span> <span class="beginner pill">Beginner</span>

Command autocompletion allows you to type commands in Jobby at unimaginable speeds.

As you type your command, you may see a list of suggested completions pop up.
Just press **TAB** or **SPACE** to select the first suggestion to fill in that text!

![Autocomplete Screenshot](images/autocomplete.png)

To temporarily hide all suggestions, press **ESC**. This temporarily disables autocompletion for the next keystroke.

If suggestions were hidden or aren't shown when they should, press **TAB** to prompt Jobby to bring it back.

<div markdown="block" class="alert alert-info">

**:bulb: Additional tips:** <br>

* If you rather choose from the list instead of typing out the prefix, it is possible to use the **UP** and **DOWN**
  arrow keys to navigate through the menu, then press **ENTER** to select them.

* Accidentally triggered autocomplete when you didn't intend to? Don't worry, just press **BACKSPACE** to immediately
  revert to your previously typed text.

* <span class="expert pill">Expert</span> Autocomplete checks for fuzzy matches - it sorts by the best *subsequence* prefix match first.

  * For example, you can type `-nm` to get the autocompletion result of `--name`.

  * This allows you to quickly choose between parameter names with similar prefixes, e.g., by typing
    `-dsp` to select `--description` instead of `--descending`.

</div>

<div markdown="block" class="alert alert-warning">

**:warning: Limitations:**<br>

* Autocomplete is not autocorrect. It will not attempt to correct mistyped details.

* Autocomplete suggests plausible values you may want to add onto your partially typed command. It does not verify that the command will run.

</div>

-------------------------------------------------------------------------------------------------

## Features

### Adding contacts - `add`
<div class="applies-to pill"><span class="jobby-data-class pill">Organization</span> <span class="jobby-data-class pill">Recruiter</span></div><br>

The `add` command allows you to create contacts to track details about the organizations and recruiters related to your job application process. To learn more about creating each type of contact, check out the sections below.

#### Adding organizations - `add --org`

<span class="learning-outcome pill">:trophy: How to add organization contacts into Jobby</span> <span class="beginner pill">Beginner</span>

##### Format
```sh
add --org --name NAME [--id ID] [--phone NUMBER] [--email EMAIL] [--url URL] [--address ADDRESS] [--tag TAG]...
```

* If an `ID` is not specified, one will be automatically generated.

##### Valid examples

| Command                                                                                                                | Reason                                                       |
|------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------|
| `add --org --name J&J`                                                                                                 | Adding an organization **J&J**.                              |
| `add --org --name Google --id g-sg --phone 98765432 `                                                                  | Adding an organization **Google** with other flags.          |
| `add --org --name Examinations NUS --phone 65166269 --email examinations@nus.edu.sg --url https://luminus.nus.edu.sg/` | Adding an organization **Examination NUS** with other flags. |


##### Invalid examples

| Command                                               | Reason                                                                                                                             |
|-------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------|
| `add --org --name`                                    | `--name` field used but not specified.                                                                                             |
| `add --org --name Google --phone 1231*&&@`            | Optional field (in this case `--phone`) was not following the [accepted parameters](#appendix-a-acceptable-values-for-parameters). |


#### Adding recruiters - `add --rec`

<span class="learning-outcome pill">:trophy: How to add recruiter contacts into Jobby</span> <span class="beginner pill">Beginner</span>

##### Format
```sh
add --rec --name NAME [-id ID] [--oid ORG_ID] [--phone NUMBER] [--email EMAIL] [--url URL] [--address ADDRESS] [--tag TAG]...
```

* When adding in parameters, be aware of the [accepted parameters](#appendix-a-acceptable-values-for-parameters).
* If an `ID` is not specified, one will be automatically generated.
* To link a <span class="jobby-data-class">Recruiter</span> to an <span class="jobby-data-class">Organization</span> in the contacts list, make sure you include `--oid` and pass in the `ID` of the <span class="jobby-data-class">Organization</span> you want to link to.

##### Sample demonstration
* If you execute the command: `add --rec --name Ryan Koh --oid job_seeker_plus`, you should see a new <span class="jobby-data-class">Recruiter</span> being added to the bottom of the contacts list.

* The newly added contact will have a special label _from organization (job\_seeker\_plus)_ to indicate that the <span class="jobby-data-class">Recruiter</span> is linked to the <span class="jobby-data-class">Organization</span> with that particular `ID`.

![add-recruiter](images/add_recruiter_success.png)

##### Valid examples

| Command                                                                                                                                                                     | Reason                                                                                                                 |
|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------|
| `add --rec --name John Doe`                                                                                                                                                 | Adds a recruiter that is not linked to any organization.                                                               |
| `add --rec --name John Doe --tag friendly --tag woogle`                                                                                                                     | Adds a recruiter with two tags - friendly and woogle.                                                                  |
| `add --rec --name John Doe --oid job_seeker_plus`                                                                                                                           | Adds a recruiter that is linked to an organization (if it exists in the address book) with the id **job_seeker_plus**. |
| `add --rec --name John Doe --id johndoe_123 --oid job_seeker_plus --number 912832192 --email johndoe@nus.edu.sg --url example.com --address 21 Kent Ridge Rd --tag network` | Adds a recruiter with all the possible fields.                                                                         |

##### Invalid examples

| Command                                     | Reason                                                                         |
|---------------------------------------------|--------------------------------------------------------------------------------|
| `add --rec`                                 | Missing a name.                                                                |
| `add --rec --name John Doe --phone`         | Optional fields (in this case `--phone`) were used but not specified.          |
| `add --rec --name John Doe --oid bogus-org` | Given that no organization with the id "bogus-org" exists in the address book. |


### Editing contacts - `edit`
<div class="applies-to pill"><span class="jobby-data-class pill">Organization</span> <span class="jobby-data-class pill">Recruiter</span></div> <br>
<span class="learning-outcome pill">:trophy: How to edit organization or recruiter info in Jobby</span> <span class="intermediate pill">Intermediate</span> <br>
<span class="information pill">:information_source: Assumes that you have read the `add` command documentation for contacts.</span> <br>

##### Format
```sh
edit INDEX/ID [--name NAME] [--id ID] [--phone PHONE] [--email EMAIL] [--url URL] [--address ADDRESS] [--tag TAG]...
```

##### Valid examples

| Command                                                         | Reason                                                                                                                         |
|-----------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------|
| `edit google --phone 91292951`                                  | Change phone number of organization with **ID** google to **91292951**.                                                        |
| `edit 1 --name Jane Street`                                     | Change name of contact at index 1 to **Jane Street**.                                                                          |
| `edit 1 --name Google --phone 91241412 --email google@gmail.sg` | Changes the name, phone number and email of the contact at index 1 to `Google`, `91241412` and `google@gmail.sg` respectively. |

##### Invalid examples

| Command                                 | Reason                                  |
|-----------------------------------------|-----------------------------------------|
| `edit google --phone 8124!@#$`          | `--phone` has an [invalid parameter]()  |


### Searching contacts - `find`
<div class="applies-to pill"><span class="jobby-data-class pill">Organization</span> <span class="jobby-data-class pill">Recruiter</span></div>

<span class="learning-outcome pill">:trophy: How to find organizations and recruiters by name or id</span> <span class="beginner pill">Beginner</span>

##### Format
```sh
find KEYWORD/ID...
```
* This will return any <span class="jobby-data-class">Organization</span> or <span class="jobby-data-class">Recruiter</span> that contains the given keywords.

##### Valid examples

| Command           | Reason                                                                                              |
|-------------------|-----------------------------------------------------------------------------------------------------|
| `find jo`         | Finds Contacts and Applications whose **KEYWORD/ID** contains the [substring](#Glossary) "jo".      |
| `find 1231`       | Finds Contacts and Applications whose **KEYWORD/ID** contains the substring "1231".                 |
| `find alex david` | Finds Contacts and Applications whose **KEYWORD/ID** contains the substring "alex" or "david".      |

##### Rules
<span class="intermediate pill">Intermediate</span>

* The search is case-insensitive. e.g `hans` will match `Hans`
* The order of the keywords does not matter. e.g. `Hans Bo` will match `Bo Hans`
* You can match partial keywords. e.g. searching for `ha` will match with `hamburger`.
* Partial IDs can match the entire ID. e.g. searching for `1234` will match with `id_12345`.
* Persons matching at least one keyword will be returned (i.e. `OR` search)
  e.g. `Hans Bo` will return `Hans Gruber`, `Bo Yang`
* Can match with multiple ids `12345 id_51231` will match with `id_12345` and `id_51231`


### Listing data - `list`
<div class="applies-to pill"><span class="jobby-data-class pill">Organization</span> <span class="jobby-data-class pill">Recruiter</span> <span class="jobby-data-class pill">Job Application</span></div>

<span class="learning-outcome pill">:trophy: How to list organizations and recruiters in Jobby by conditions</span> <span class="intermediate pill">Intermediate</span>

##### Format
```sh
list [--org / --rec / --toapply]
```

* Supplying `--org` lists only <span class="jobby-data-class">Organizations</span> while supplying `--rec` lists only <span class="jobby-data-class">Recruiters</span>. Specifying neither will list all contacts.

* Supplying `--toapply` lists <span class="jobby-data-class">Organizations</span> you have not applied to.

[SCREENSHOT HERE - LEFT SIDE: LIST --ORG, RIGHT SIDE: LIST --REC]

##### Valid examples
* `list`
* `list --org`
* `list --rec`
* `list --toapply`


### Sorting data - `sort`
<div class="applies-to pill"><span class="jobby-data-class pill">Organization</span> <span class="jobby-data-class pill">Recruiter</span> <span class="jobby-data-class pill">Job Application</span></div>

<span class="learning-outcome pill">:trophy: How to sort contacts and job applications in Jobby</span> <span class="intermediate pill">Intermediate</span>

##### Format
```sh
sort --FLAG_TO_SORT [--ascending / --descending]
```

This sorts contacts or job applications by the specified field.

##### Supported fields <sub>(only 1 may be provided)</sub>

###### Fields for Contacts
* `--address` - The address of the <span class="jobby-data-class">Contact</span>. Will sort alphabetically.
* `--email` - The email address of the <span class="jobby-data-class">Contact</span>. Will sort alphabetically.
* `--id` - The identification string of the <span class="jobby-data-class">Contact</span>. Will sort alphabetically.
* `--name` - The name of the <span class="jobby-data-class">Contact</span>. Will sort alphabetically.
* `--phone` - The phone number of the <span class="jobby-data-class">Contact</span>. Will sort alphabetically.
* `--url` - The web address of the <span class="jobby-data-class">Contact</span>. Will sort alphabetically.

###### Fields for Job Applications
* `--by` - The deadline of the <span class="jobby-data-class">Job Application</span>. Will sort chronologically.
* `--stage` - The stage of the <span class="jobby-data-class">Job Application</span>. Will sort by stage order.
* `--stale` - The time of last update of the <span class="jobby-data-class">Job Application</span>. Will sort chronologically.
* `--status` - The status of the <span class="jobby-data-class">Job Application</span>. Will sort by status order.
* `--title` - The title of the <span class="jobby-data-class">Job Application</span>. Will sort alphabetically.

###### Resetting the sort order
* `--none` - Will reset the sorting order of <span class="jobby-data-class">Contacts</span> and <span class="jobby-data-class">Job Applications</span>.

###### Changing the sort order
* `--ascending` - The specified flag will sort in ascending order.
* `--descending` - The specified flag will sort in descending order.

If neither `--ascending` or `--descending` are provided, the list will be sorted in ascending order by default.

Neither `--ascending` nor `--descending` may be specified if the flag is `--none`.

`sort` will work even if no <span class="jobby-data-class">Contacts</span> or <span class="jobby-data-class">Job Applications</span> exist.

##### Sample demonstration

[SCREENSHOT HERE]

##### Valid examples
* `sort --title --ascending`
* `sort --url`
* `sort --stale --descending`
* `sort --none`

##### Invalid examples
* `sort` _No flag provided._
* `sort --organization` _Invalid flag._
* `sort --none --ascending` _Flags `--none` and `--ascending` both specified._


### Reminding about deadlines - `remind`
<div class="applies-to pill"><span class="jobby-data-class pill">Job Application</span></div>

<span class="learning-outcome pill">:trophy: How to get reminders of deadlines in Jobby</span> <span class="intermediate pill">Intermediate</span>

Reminds the user of upcoming deadlines for job applications.

##### Format
```sh
remind --earliest / --latest
```

* Specifying `--earliest` will list the application deadlines in order of urgency, from earliest to latest.

* Specifying `--latest` will list the application deadlines in order of reverse urgency, from latest to earliest.


##### Sample demonstration
* To see your application deadlines from the earliest to latest, use the command `remind --earliest`.

![Remind Earliest](images/starter-guide/remind-earliest.jpg)

##### Valid examples
* `remind --earliest`
* `remind --latest`


### Applying to organizations - `apply`
<div class="applies-to pill"><span class="jobby-data-class pill">Job Application</span></div>

<span class="learning-outcome pill">:trophy: How to record your job applications associated with an organization in Jobby</span> <span class="intermediate pill">Intermediate</span> <br>
<span class="information pill">:information_source: You need to have organizations stored in Jobby to use this command.</span>

##### Format
```sh
apply INDEX/ID --title TITLE [--description DESCRIPTION] [--by DEADLINE: DD-MM-YYYY] [--stage APPLICATION STAGE: resume | online assessment | interview] [--status STATUS: pending | offered | accepted | turned down]
```

##### Valid examples

| Command                                                                                                                          | Reason                                                                                                                         |
|----------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------|
| `apply 1 --title SWE`                                                                                                            | Apply to the **organization** at index 1, for the title of **SWE**.                                                            |
| `apply google --title Unit Tester --by 12-12-2023`                                                                               | Apply to the **organization** with ID of *google** for title of **Unit Tester** by **12-12-2023**.                             |

##### Invalid examples

| Command                               | Reason                                              |
|---------------------------------------|-----------------------------------------------------|
| `apply 0 --title SWE`                 | Invalid index as index starts at 1.                 |
| `apply 1 --title`                     | Invalid as `--title` is declared but not specified. |
| `apply 1 --title SWE --by 31-31-2023` | Invalid date for deadline.                          |

### Editing job applications - `edit --application`
<div class="applies-to pill"><span class="jobby-data-class pill">Job Application</span></div>

<span class="learning-outcome pill">:trophy: Able to edit job applications associated with an organization in Jobby</span> <span class="intermediate pill">Intermediate</span> <br>
<span class="information pill">:information_source: Assumes that you have read the `apply` command documentation.</span> <br>

##### Format
```sh
edit --application INDEX [--title TITLE] [--description DESCRIPTION] [--by DEADLINE] [--status STATUS] [--stage STAGE]
```

##### Valid examples

| Command                                    | Reason                                                          |
|--------------------------------------------|-----------------------------------------------------------------|
| `edit --application 1 --title SRE`         | Change the title of the job application at index 1 to **SRE**.  |
| `edit --application 1 --status pending`    | Change the status of job application at index 1 to **pending**. |

##### Invalid examples

| Command                                      | Reason                                |
|----------------------------------------------|---------------------------------------|
| `edit --application 0 --title SRE`           | Invalid index.                        |
| `edit --application 1`                       | None of the fields to edit are given. |
| `edit --application 1 --by 31-31-2023`       | The date is invalid.                  |


### Deleting data - `delete`
<div class="applies-to pill"><span class="jobby-data-class pill">Organization</span> <span class="jobby-data-class pill">Recruiter</span> <span class="jobby-data-class pill">Job Application</span></div>

<span class="danger pill">:warning: The deletion of data is permanent and there is no way to undo it.</span>

#### Deleting contacts - `delete`

<span class="learning-outcome pill">:trophy: How to delete contacts and job applications in Jobby</span> <span class="intermediate pill">Intermediate</span>

##### Format
```sh
delete INDEX/ID [--recursive]
```
* `--recursive` flag deletes the associated recruiter contacts and internship applications if the contact to delete is an organization.

##### Valid examples

| Command                | Reason                                                                                 |
|------------------------|----------------------------------------------------------------------------------------|
| `delete 1`             | This will delete the contact at index 1.                                               |
| `delete josh`          | This will delete the contact with the **ID** of **josh**.                              |
| `delete 1 --recursive` | This will delete a contact and all its associated recruiter contacts and applications. |

##### Invalid examples

| Command                | Reason                                                              |
|------------------------|---------------------------------------------------------------------|
| `delete 0`             | Invalid index, as index starts from 1.                              |

#### Deleting job applications - `delete --application`

<span class="learning-outcome pill">:trophy: Able to delete job applications in Jobby</span> <span class="intermediate pill">Intermediate</span>

##### Format
```sh
delete --application INDEX
```

##### Valid examples

| Command                  | Reason                                                              |
|--------------------------|---------------------------------------------------------------------|
| `delete --application 1` | This will delete the application at index 1.                        |

##### Invalid examples

| Command                  | Reason                                            |
|--------------------------|---------------------------------------------------|
| `delete --application 0` | Invalid index, as index starts from 1.            |


--------------------------------------------------------------------------------------------------------------------

## Command Summary

### Commands for Handling Contacts

| Action               | Format, Examples                                                                                                                                                                                                               |
|----------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| **Add Organization** | `add --org --name NAME [--id ID] [--phone NUMBER] [--email EMAIL] [--url URL] [--address ADDRESS] [--tag TAG]...`<br> e.g., `add --org --name NUS --phone 0123456789 --email example@nus.edu.sg --url https://www.nus.edu.sg/` |
| **Add Recruiter**    | `add --rec --name NAME [--id ID] [--oid ORG_ID] [--phone NUMBER] [--email EMAIL] [--url URL] [--address ADDRESS] [--tag TAG]...`<br> e.g., `add --rec --name John Doe --oid paypal-sg`                                         |
| **Delete Contact**   | `delete INDEX/ID [--recursive]` <br> e.g., `delete 3`, `delete id-55tg`                                                                                                                                                        |
| **Edit Contact**     | `edit INDEX/ID [--name NAME] [--id ID] [--phone PHONE] [--email EMAIL] [--url URL] [--address ADDRESS] [--tag TAG]...`                                                                                                         |
| **Find**             | `find KEYWORD [MORE_KEYWORDS]`<br> e.g., `find James Jake`                                                                                                                                                                     |
| **List**             | `list [--org/--rec/--toapply]`                                                                                                                                                                                                 |
| **Sort Contacts**    | `sort --address/--email/--id/--name/--phone/--url [--ascending/--descending]`                                                                                                                                                  |

### Commands for Handling Job Applications

| Action                 | Format, Examples                                                                                                                                                           |
|------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| **Delete Application** | `delete --application INDEX` <br> e.g., `delete --application 2`                                                                                                           |
| **Edit Application**   | `edit --application INDEX [--title TITLE] [--description DESCRIPTION] [--by DEADLINE] [--status STATUS] [--stage STAGE]` <br> e.g., `edit --application 2 --title Analyst` |
| **Apply**              | `apply INDEX/ID --title TITLE [--description DESCRIPTION] [--by DEADLINE] [--stage STAGE] [--status STATUS]`                                                               |
| **Sort Applications**  | `sort --by/--stage/--stale/--status/--title [--ascending/--descending]`                                                                                                    |

### Other Commands

| Action    | Format, Examples |
|-----------|------------------|
| **Clear** | `clear`          |
| **Help**  | `help`           |

--------------------------------------------------------------------------------------------------------------------

## Glossary

| Term                 | Definition                                                                                                                                                                               |
|----------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| **Top Level Domain** | A Top Level Domain (TLD) is the part of the website address where it comes after the last dot (i.e. ".com", ".org", ".net") and before the first slash. (E.g. www.example.**com**/path). |
| **Whitespace**       | In the context of this application, a whitespace is any number of spaces or tabs that is in the input.                                                                                   |
| **Contact**          | A contact in Jobby is can be an **organization** or a **recruiter**.                                                                                                                     |
| **Substring**        | A substring is a contiguous sequence of characters within a string. <br> e.g. "pp" is a substring of "apple", "mac" is a substring of "macDonald" and "intimacy"                         |


## Appendices

### Appendix A: Acceptable values for parameters

| Parameter     | Used by                                                                                                                                                                                                                                                                                         | Requirements                                                                                                                                                                                                                                                                                                                                                                                                                | Examples                                                                            |
|---------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------|
| `INDEX`       | [`edit`](#editing-contacts---edit) <br> [`apply`](#applying-to-organizations---apply) <br> [`edit --application`](#editing-job-applications---edit---application) <br> [`delete`](#deleting-contacts---delete) <br> [`delete --application`](#deleting-job-applications---delete---application) | A valid index can accept any positive integer up to the number of items in the contact or job application list where applicable.                                                                                                                                                                                                                                                                                            | `1`<br>`10`                                                                         |
| `NAME`        | [`add --org`](#adding-organizations---add---org) <br> [`add --rec`](#adding-recruiters---add---rec) <br> [`edit`](#editing-contacts---edit)                                                                                                                                                     | A valid name can accept any non-empty value.                                                                                                                                                                                                                                                                                                                                                                                | `Ryan Koh`<br>`小明`                                                                  |
| `ID`          | [`add --org`](#adding-organizations---add---org) <br> [`add --rec`](#adding-recruiters---add---rec) <br> [`edit`](#editing-contacts---edit) <br> [`apply`](#applying-to-organizations---apply) <br> [`delete`](#deleting-contacts---delete)                                                     | A valid ID has to start with a letter.<br><br>It can consist of alphanumeric and basic symbols (i.e. `a-z`, `A-Z`, `0-9`, `-`, `_`)                                                                                                                                                                                                                                                                                         | `woogle123`<br>`ryan_soc-rec`                                                       |
| `NUMBER`      | [`add --org`](#adding-organizations---add---org) <br> [`add --rec`](#adding-recruiters---add---rec) <br> [`edit`](#editing-contacts---edit)                                                                                                                                                     | A valid phone number can consist of only numbers with no whitespace.<br><br>It must be at least 3 digits.                                                                                                                                                                                                                                                                                                                   | `999`<br>`91824137`                                                                 |
| `EMAIL`       | [`add --org`](#adding-organizations---add---org) <br> [`add --rec`](#adding-recruiters---add---rec) <br> [`edit`](#editing-contacts---edit)                                                                                                                                                     | A valid email should be in the form of `local-part@domain` where the `local-part` and `domain` must be separated by a single **@**.<br><br>The `local-part` can consist of any character except whitespace.<br><br>The `domain` name can comprise of one or more labels separated by periods, and each label can include any character except whitespace. The last `domain` label must be a minimum of two characters long. | `ryankoh@nus`<br>`ryan-koh@nus.edu.sg`                                              |
| `URL`         | [`add --org`](#adding-organizations---add---org) <br> [`add --rec`](#adding-recruiters---add---rec) <br> [`edit`](#editing-contacts---edit)                                                                                                                                                     | A valid url should include a part in the form of `domain.tld` where the `domain` and the `tld` (top level domain) must be separated by a period.                                                                                                                                                                                                                                                                            | `example.com`<br>`example.more.com`<br>`https://example.com`<br>`example.com/more`  |
| `ADDRESS`     | [`add --org`](#adding-organizations---add---org) <br> [`add --rec`](#adding-recruiters---add---rec) <br> [`edit`](#editing-contacts---edit)                                                                                                                                                     | A valid address can accept any non-empty value.<br><br>For a contact, it designates its physical address.                                                                                                                                                                                                                                                                                                                   | `21 Lower Kent Ridge Rd`                                                            |
| `TAG`         | [`add --org`](#adding-organizations---add---org) <br> [`add --rec`](#adding-recruiters---add---rec) <br> [`edit`](#editing-contacts---edit)                                                                                                                                                     | A valid tag can consist of only alphanumeric characters.                                                                                                                                                                                                                                                                                                                                                                    | `internship`<br>`network`<br>`parttime`<br>`jobPortal`                              |
| `ORG_ID`      | [`add --rec`](#adding-recruiters---add---rec)                                                                                                                                                                                                                                                   | A valid organization ID is subject to the same requirements as the ID parameter.<br><br>It must belong to an <span class="jobby-data-class">Organization</span> contact in the address book.                                                                                                                                                                                                                                | `woogle123`<br>`meta_sg-1`                                                          |
| `TITLE`       | [`apply`](#applying-to-organizations---apply) <br> [`edit --application`](#editing-job-applications---edit---application)                                                                                                                                                                       | A valid title can accept multiple words separated with spaces, as long as the characters are alphanumeric.                                                                                                                                                                                                                                                                                                                  | `Software Engineer`<br>`Level 3 Engineer`                                           |
| `DESCRIPTION` | [`apply`](#applying-to-organizations---apply) <br> [`edit --application`](#editing-job-applications---edit---application)                                                                                                                                                                       | A valid description can accept any non-empty value.                                                                                                                                                                                                                                                                                                                                                                         | `Senior Role`<br>`Hourly rate: $25`                                                 |
| `DEADLINE`    | [`apply`](#applying-to-organizations---apply) <br> [`edit --application`](#editing-job-applications---edit---application)                                                                                                                                                                       | A valid deadline should be a date in the form of `DD-MM-YYYY`.<br><br>The day (`DD`) and month (`MM`) can be either single or double digits.                                                                                                                                                                                                                                                                                | `09-02-2022`<br>`9-2-2022`<br>`19-11-2022`                                          |
| `STAGE`       | [`apply`](#applying-to-organizations---apply) <br> [`edit --application`](#editing-job-applications---edit---application)                                                                                                                                                                       | A valid job application stage can accept only one of the three values: `resume`, `online assessment`, `interview`.<br><br>The values are ranked in the order shown.                                                                                                                                                                                                                                                         | `resume`<br>`online assessment`<br>`interview`                                      |
| `STATUS`      | [`apply`](#applying-to-organizations---apply) <br> [`edit --application`](#editing-job-applications---edit---application)                                                                                                                                                                       | A valid job application status can accept only one of the four values: `pending`, `offered`, `accepted`, `turned down`.<br><br>The values are ranked in the order shown.                                                                                                                                                                                                                                                    | `pending`<br>`offered`<br>`accepted`<br>`turned down`                               |
| `KEYWORD`     | [`find`](#searching-contacts---find)                                                                                                                                                                                                                                                            | A valid keyword is a single word that can accept any non-empty value.                                                                                                                                                                                                                                                                                                                                                       | `software`<br>`Ryan`                                                                |


--------------------------------------------------------------------------------------------------------------------

## Issues

(Where to report issues and what bugs currently exist)
