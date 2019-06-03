# justForJeff

Running on your local computer. (For Intellij Users only) FEED ticket for other methods
1. Clone the repo
2. Open the repo in Intellij
3. Open Main.java
4. Press the green play button (Run Main.java)
5. Pray that it runs

GET localhost:8080/resource
Will return all of the data current in the DB

PUT localhost:8080/resource/data
Will update the person with the specific id

DELETE localhost:8080/resource/data/<id>
Will delete the id specified

Describe the following concepts and how you would approach the solution.

* Securing the endpoint in production

A few ways this can be achieved is through 3rd party services like sumologic. Also for production, I would add more validation for what is being sent into the endpoints. For example, make sure the user doesnt send anything that will cause the service to fail. Since this service interacts with a database, in production, I want to also add in an ORM so that the malicious users wont try to sql inject anything into the database.

* Monitoring the endpoint

Monitor endpoint via sumologic. Track the number of times that users are hitting the endpoints. Also create a "heartbeat" to show that the endpoint is still live.

* Scaling the deployment to meet continually escalating demand

CICD pipelines like gitlab, where the process and the black magic can be "under the hood" so developers can focus on pushing out features.

