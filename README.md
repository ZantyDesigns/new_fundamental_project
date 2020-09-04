# **_Fundamental Project - Mountain Bike Trails_**

### **_Resources_**
 * Presentation:
 * Jira:
 * Website:
 
## Contents
* [Project Brief](#project-brief)
* [Project Objectives](#project-objectives)
* [Project Outcome](#project-outcome)
* [Project Management](#project-management)
* [Risk Assessment](#risk-assessment)
* [Testing](#testing)
* [Issues](#issues)
* [Future Improvements](#future-improvements)
* [References](#references)

## Project Brief
As a software developer, we have been assigned the task of planning and developing a fully functional web based application using (insert technologies). The app must be user friendly and provide security measures to ensure the user can access and use the application safely. The application must meet the requirements of CRUD and be stored on the cloud.

## Project Objectives
* Develop a responsive web-based application to view user selected mountain bike trails in the U.K.
* Create a secure database to store trail location data.
* Implement trail locations using Google Maps via Google API.
* Implement the ability for users to Create, Read, Update and Delete Trail locations.

## Project Outcome
* User can register an account with a username and password
* User can select and view trails and locations via Google Maps
* User can add new trail locations aswell as update current trails

## Project Management

## Entity Relationship Diagram
An Entity Relationship Diagram was created during the planning stages of the project to help visualize what tables I would need to store in the database and the realtionships these tables had between each other.
![erd](https://i.imgur.com/7vBNYIQ.png)

## Risk Assessment
| Risk                                     | Analysis of Risk                                                                                                                                                                                                                 | Probability | Severity | Action                                                                                                                                                                                                                               |
|------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|----------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Using the application while Riding       | The user may attempt to use the application on their phone and would therefore cause a loss of concentration and potentialy a loss of control causing injury.                                                                    | Not Likely  | Low      | Present a disclaimer on the applications front page to tell users not to use the  application while riding their bike.                                                                                                               |
| Database breach                          | Data stored within the database such as bike park information could  potentially be deleted by attackers. The attackers could potentially  delete the database entirely and would cause the website to no longer be  functional. | Not Likely  | Low      | As the data being deleted is neither valuable or of high importance the data would just need to be restored from a backup. The database would be regularly backed up on a  local machine in the event of the database being deleted. |
| Google Cloud Server goes Offline         | Google Cloud could potentially take the servers offline for scheduled maintenance or the server could unexpectedly crash.                                                                                                        | Not Likely  | Moderate | Create another virtual machine as a backup to be run in the case of the first one failing.                                                                                                                                           |
| Accidental deletion of records from user | Users may accidentally delete records while viewing them.                                                                                                                                                                        | Likely      | Low      | Add undo functionality as a button so users can revert deletion of records.                                                                                                                                                          |
| Hackers tracking user location           | As the application is intended to be used as a mobile web application using Google Maps API, there is a possibility that intruders may be able to hack into the users device and gather real time location data.                 | Not Likely  | Severe   | Ensure user connections to the web server are heavily encrypted so location data cannot be accessed.                                                                                                                                 |

## Testing

## Issues

## Future Improvements

## References
