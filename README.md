Weather Data
============

Poll and store the weather for Sydney every 10 min

1. Use "http://api.openweathermap.org/data/2.5/weather?q=Sydney,au" to retrieve current data.
2. Store the temp, humidity and pressure in the DB using a Hibernate entity.
3. Log how many records you have stored so far by querying the DB.
4. Repeat from step 1 every 10 minutes.

You are free to add dependencies in the pom.xml. Use any library you like. Solve the task however you prefer. The only requirements are that you use the output of the given weather API and store the data using Hibernate entities. You can query the DB using native JDBC or other libraries if you like.

If that is all too easy and you want to show-off with some unit tests feel free to add them but this is not a requirement.
