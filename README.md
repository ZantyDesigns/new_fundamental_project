# **_Fundamental Project - Mountain Bike Trails_**

### **_Resources_**
 * Presentation: https://docs.google.com/presentation/d/1bLm8JP-N2AEOxREivX_tC338M_pduU0nlrTgE1auUk8/edit?usp=sharing
 * Jira: https://jnah.atlassian.net/secure/RapidBoard.jspa?rapidView=1&projectKey=PROJ&atlOrigin=eyJpIjoiYWViZjkyZjQyYjI0NGUxYzhjMTQ2N2I2MzFkYWQ0ZTEiLCJwIjoiaiJ9
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
As a software developer, we have been assigned the task of planning and developing a fully functional web based application using Java, Spring Boot, HTML/CSS and GCP. The app must be user friendly and provide security measures to ensure the user can access and use the application safely. The application must meet the requirements of CRUD and be stored on the cloud. For this project, the aim was to develop a mobile solution that mountain bike enthusiasts could use to track bike parks they have visited aswell as find new parks to visit.

## Project Objectives
* Develop a responsive web-based application to view user selected mountain bike parks in the U.K.
* Create a secure database to store bike park data via MySQL.
* Implement the ability for users to Create, Read, Update and Delete bike park locations.

## Project Outcome
* User can select and view bike parks and locations.
* User can add new bike park locations aswell as delete bike park entries.
* User friendly web application compatible with mobile devices.


## Project Management

## Jira & Sprints
A kanban board was created using Jira to plan user stories and tasks in advance to track project development progress and stages. User stories were created to imitate scenarios of how the end user would be using the functionality of the web application and their expected outcome e.g. User can add new bike parks. Developement tasks were then generated for each user story to breakdown how these features were going to be implemented. These tasks and user stories were collectively added to a sprint which gave time contraints to each implementation. This allowed for efficient time management and the ability to visualize the level of importance for each task. 
![jira](https://i.imgur.com/tV5gTFP.png)

## Entity Relationship Diagram
An Entity Relationship Diagram was created during the planning stages of the project to help visualize what tables I would need to store in the database and the relationships these tables had between each other. The database structure for the application was fairly simple as a maximum of two tables were needed for the basic implementation. I had one table to store Bike Park information such as its ID, name address and description, and a table to store the trail data for each bike park which also needed an ID, a name and a description along with the colour to represent the difficulty of the trail.
![erd](https://i.imgur.com/VWKcqB5.png)

## Risk Assessment
| Risk                                     | Analysis of Risk                                                                                                                                                                                                                 | Probability | Severity | Action                                                                                                                                                                                                                               |
|------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|----------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Using the application while Riding       | The user may attempt to use the application on their phone and would therefore cause a loss of concentration and potentialy a loss of control causing injury.                                                                    | Not Likely  | Low      | Present a disclaimer on the applications front page to tell users not to use the  application while riding their bike.                                                                                                               |
| Database breach                          | Data stored within the database such as bike park information could  potentially be deleted by attackers. The attackers could potentially  delete the database entirely and would cause the website to no longer be  functional. | Not Likely  | Low      | As the data being deleted is neither valuable or of high importance the data would just need to be restored from a backup. The database would be regularly backed up on a  local machine in the event of the database being deleted. |
| Google Cloud Server goes Offline         | Google Cloud could potentially take the servers offline for scheduled maintenance or the server could unexpectedly crash.                                                                                                        | Not Likely  | Moderate | Create another virtual machine as a backup to be run in the case of the first one failing.                                                                                                                                           |
| Accidental deletion of records from user | Users may accidentally delete records while viewing them.                                                                                                                                                                        | Likely      | Low      | Add undo functionality as a button so users can revert deletion of records.                                                                                                                                                          |
| Hackers tracking user location           | As the application is intended to be used as a mobile web application using Google Maps API, there is a possibility that intruders may be able to hack into the users device and gather real time location data.                 | Not Likely  | Severe   | Ensure user connections to the web server are heavily encrypted so location data cannot be accessed.                                                                                                                                 |

## Deployment


## Issues
As the project was progressivly updated and backed up via GitHub when new features were gradually implemented, there were few issues with the overall development of the project. There was one incident where the project structure was incorrrect and required restructuring the project. This required downloading a backup version from the GitHub repository and creating a new local repository with the correct structure.

## Future Improvements
I would like to add more visual elements to the web application such as Google Maps API integration to view real time location data for each bike park entry. I would also like to add the ability for users to update current bike park entries to ensure the information stored is reliable. Furthermore, a user account creation feature would also be implemented so that registered accounts could personalize their own profiles with diaries of bike parks they have visited or added.

## Author
* Jordan Hamilton
*QA Cloud Native Consultant
*JHamilton@QA.com
