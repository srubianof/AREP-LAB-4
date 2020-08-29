# Micro Spring Server  

For the following workshop a web server in Java was built. This server is capable to deliver HTML pages, as well as some content. This server provides an IoC framework where web applications are built by using POJOS
## Getting Started
The solution was deployed for continous delivering and continous integration in Heroku and CircleCi respectively.
[![Deploy](https://www.herokucdn.com/deploy/button.svg)](https://tranquil-temple-95992.herokuapp.com/)
[![CircleCI](https://circleci.com/gh/srubianof/AREP-LAB-4.svg?style=svg)](https://circleci.com/gh/srubianof/AREP-LAB-4) 

The following commands will get you a copy of the project and you will be able to run it on your machine for further development and testing purposes. 

Keep in mind that in order to view the solution deployed to Heroku, there are different URLs to do so:
* /Apps/hola
* /Apps/pi
* /Apps/pagina
### Prerequisites

- Java SE Development Kit 8
- Java SE Runtime Environment 8
- Maven
- To run a local heroku app you will need to intall last version of Heroku CLI.
- Git. 


### Installing

Clone the repository with the following command

```
git clone https://github.com/srubianof/AREP-LAB-4.git
```

Built the application with the help of Maven
```
mvn clean install
```
Once you have done that, execute it with Maven with the following command:
```
 mvn exec:java -Dexec.mainClass="co.edu.escuelaing.sparkd.SparkD.SparkDServer"
```
To open a local Heroku Server you can execute the following command.
```
 heroku local web
```
you can access the local server at http://localhost:5000


## Running the tests

Test cases are automated with JUnit and can be executed with the following command:
```
mvn test
```

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management
* Java


## Author

## Author

[**Santiago Rubiano Fierro**](https://github.com/srubianof) Software Engineering Student

## License

 This project is licensed under the MIT License - see the [LICENSE.md](https://github.com/srubianof/AREP-LAB-1/blob/master/LICENSE) file for details.
