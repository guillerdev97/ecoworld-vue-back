Eco World
============


***


## Contexto del proyecto

Requisitos mínimos solicitados:

Frontend:

    El uso de un framework no es obligatorio pero si recomendado (En el caso de no usar un framework se deberá utilizar un enpaquetador Ej: Parcel)
    El frontend realizará solicitudes a la API REST
    Desde la parte del front se tiene que poder realizar las acciónes de un CRUD

​

Backend:

    La parte de backend se debe realizar con JAVA y utilizando Springboot
    Se deberá contruir una API REST para que el front pueda consumir lo datos.
    La API debe permitir realizar un CRUD

​

Extra:

    Implementar la posibilidad de realizar una busqueda de un dato en concreto con un buscador


## Description


## Functional Requirementes


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
  git clone https://github.com/guillerdev97/ecoworld-vue-front.git
```

Create a local database in phpMyAdmin with user: root, password: "".
Name of the database: products.
Execute migration: "php artisant migration:fresh --seed".

Go to the project directory
```bash
  cd ecoworld-vue-front
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

- [Presentation PPTX](https://docs.google.com/presentation/d/1Zc2Ych_LMoZlomHBk4lKgpdKfuSpdepYfNJxhFhCJbE/edit?usp=sharing)
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
