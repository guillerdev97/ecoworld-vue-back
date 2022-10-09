Eco World
============


***

## Project

The idea of this website is that it is scalable, and that in the future, it can be a professional website.

On the other hand, the business logic is to sell ecological products, facilitating and putting Asturian SMEs and local stores in contact. It is a retail sale.

The website belongs to the Asturian corporation of companies (SMEs), which have come together to give visibility to their products and strengthen their position against large companies.

Asturian SMEs, farms and factories will be advertised on this website, and small local shops may purchase such products at retail.

The website offers a point of contact for SMEs that want to join the corporation to do so.


## Contexto del proyecto

## Functional Requirementes

Frontend: [link to frontend project](https://github.com/guillerdev97/ecoworld-vue-front)

    The use of a framework is not mandatory but it is recommended (In the case of not using a framework, a packager should be used Eg: Parcel).
    The frontend will make requests to the REST API.
    From the front part you have to be able to perform the actions of a CRUD.



​

Backend: [link to frontend project](https://github.com/guillerdev97/ecoworld-vue-back)

    The backend part must be done with JAVA and using Springboot.
    A REST API must be built so that the front can consume the data.
    The API must allow performing a CRUD.


Extra requirements:

   Implement the possibility of performing a search for a specific piece of data with a search engine.


## Not Functional Requirements

## Presentation:

<ul>
<li>GitHub link.</li>
<li>Readme with:</li>
    <ul>
        <li>Briefing and project explanation.</li>
        <li>Diagrams.</li>
        <li>Sketch - Mockup - Prototype.</li>
    </ul>
<li>Google Slides presentation.</li>
<li>Demo and code review</li>

</ul>


***
***


## Run Locally

Clone the project
```bash
  git clone https://github.com/guillerdev97/ecoworld-vue-back.git
```

Create a local database in phpMyAdmin with user: root, password: "".
Name of the database: products.
Execute migration: "php artisant migration:fresh --seed".

Go to the project directory
```bash
  cd ecoworld-vue-back
```

Install dependencies
```bash
  composer update
  npm install
```

Start the server
```bash
  run Apache and MySQL server in XAMPP
  php artisan serve
  npm run dev
```

## Work methodology

- TDD
- Agile
- Scrum


## Versions
Main branch: stable work done in this branch.
Develop branch: production word in this branch.

#### Tools and technologies used

| Front End | Back End | Diseño y organización | 
| :---: | :---: | :---: |
| <img src="https://github.com/Yelose/Yelose/blob/main/img/vscode.png"> <img src="https://github.com/Yelose/Yelose/blob/main/img/html.png"> <img src="https://github.com/Yelose/Yelose/blob/main/img/bootstrap.png">  <img src="https://github.com/Yelose/Yelose/blob/main/img/css.png"> | <img src="https://github.com/Yelose/Yelose/blob/main/img/mysql.png"> <p style="color: white; font-size: 30px;">JAVA</p> | <img src="https://github.com/Yelose/Yelose/blob/main/img/figma.png"> <img src="https://github.com/Yelose/Yelose/blob/main/img/jira.png"> <img src="https://github.com/Yelose/Yelose/blob/main/img/google.png">  |


## Documentation

- [Project](https://docs.google.com/document/d/1IRVNS3ypx5EiL-3-bowJrX5P6STYCfkLCm1ctaQSDPU/edit?usp=sharing)
- [User Stories](https://docs.google.com/document/d/1bu1sXLucbUUZImvh2dEEr0OyieFw_CcoXwYy5K9okBg/edit?usp=sharing)
- [Prototype](https://www.figma.com/file/SsQaavzZ0BiLUkSxbW59qx/Eco-World?node-id=0%3A1)
- [UserFlow Figma](https://www.figma.com/file/SsQaavzZ0BiLUkSxbW59qx/Eco-World?node-id=16%3A4)
<img src="img/userflow-eco-world.jpg" style="margin-left: 30px; width: 80%; margin: auto;">


## Authors

| Nombre | Roll | <img src="https://github.com/Yelose/Yelose/blob/main/img/github.png" width="30px" height="30px"> |
| :--- | :---: | :---: |
| Guillermo García | Software Developer | https://github.com/guillerdev97 |


## Acknowledgements

 - [Awesome Readme Templates](https://awesomeopensource.com/project/elangosundar/awesome-README-templates)
 - [Awesome README](https://github.com/matiassingers/awesome-readme)
 - [How to write a Good readme](https://bulldogjob.com/news/449-how-to-write-a-good-readme-for-your-github-project)
