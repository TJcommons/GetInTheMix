GetInTheMix
===========
GetInTheMixInternational: A Social Networking Web Application by Julien Randoulet and Tobias Lovell

(alternative name suggestions welcome - I just came up with something ridiculous to get started...)

GetInTheMixInternational is a Java web application designed to offer a service whereby people can search for events and activities in their local area. These can be professional or socal events. Users can register on the homepage and fill in a web form with required fields of username, password, email and three interests. Once registered, there is the functionality to search for events by interest category and location and then sign up as an attendee for that event. Registered users are also able to sign up to a group, start a group, or post an event. It is not a requirement for users to start a group in order to hold an event. Other users can sign up to to groups and receive notification about upcoming events and also post comments and other files before, during, and after the event.

Events can be promoted if users have registered their interest in this category on their registration form. Also they can choose to be notified of upcoming events held by certain individuals if they have previously attended an event held by that user.

Users can search without registering.

The application is written in Java using the MVC pattern as its basis. Spring is used as the framework in this project and is operated via a Maven POM file. Hibernate handles the mapping of the JavaBeans to the tables of a MySQL database. The application is deployed on Apache Tomcat. JSPs provide the View and this is styled using CSS, JavaScript and JQuery. Development is TDD and each stage of development begins with discussing functionality in a project meeting and then deciding on which tests need to be written. During the test driven development cycle, the code is refactored and improved. 
 
