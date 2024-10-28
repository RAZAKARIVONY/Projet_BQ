# démo de springboot-crud


La démonstration Spring Boot CRUD montre comment implémenter des opérations CRUD simples avec une Produit entité.

### Qu'y a-t-il à l'intérieur
Ce projet est basé sur le projet Spring Boot et utilise ces packages :
Ce projet est basé sur le projet Spring Boot et utilise ces packages :
##### Spring Web.
##### Spring Data Jpa.
##### Thymleaf
##### Spring Security.
##### Devtools.
##### MySQL Driver.

# Installation
Le projet est créé avec Maven, il vous suffit donc de l'importer dans votre IDE et de générer le projet pour résoudre les dépendances

Configuration de la base de données
Créez une base de données MySQL avec le nom springbootdbet ajoutez les informations d'identification à /resources/application.properties.

Les informations par défaut sont :

spring.datasource.diver-class-name =com.mysql.cj.jdbc.Driver
spring.datasource.url = jdbc:mysql://localhost:3306/User_Data?createDatabaseIfNotExist=true
spring.datasource.username = root
spring.datasource.password = 

# Usage
Exécutez le projet via l'IDE et accédez à http://localhost:8080
