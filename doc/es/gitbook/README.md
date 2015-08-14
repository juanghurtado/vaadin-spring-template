# Cómo colaborar con la documentación

Esta documentación se genera haciendo uso de Markdown y [GitBook](https://github.com/GitbookIO/gitbook).

Para modificar la documentación solo hay que añadir o modificar uno de los fichero Markdown existentes dentro de la carpeta `./doc/<idioma>/` de este proyecto. Puedes consultar la sintáxis desde [la guía de uso de Markdown](https://guides.github.com/features/mastering-markdown/)

Puedes descargar el [editor de Gitbook para tu sistema operativo](https://github.com/GitbookIO/editor/releases). Una vez que lo tengas instalado solo tienes que abrir la carpeta `./doc/<idioma>/` del proyecto con el editor y empezar a escribir.

Si necesitas añadir imágenes, puedes añadirlas dentro de la carpeta `./doc/<idioma>/resources`. Es aconsejable también añadir dentro de esta carpeta el fuente de la imagen por si fuera necesario modificarla.

Para añadir las imágenes debes usar el siguiente código:

```
![Image demo](resources/keep-calm-portada.jpg)
```

Si creas una nueva sección para el documento recuerda que tienes que añadirla en el fichero `./doc/<idioma>/SUMMARY.md` si no utilizas el editor de GitBook.

### Generar documentación en formato PDF y HTML

Para generar la documentación necesitas tener una versión superior a la 2.0.0 de GitBook. Si no fuera así, puedes desinstalar tu versión instalada con el siguiente comando:

```
$ npm uninstall -g gitbook
```

Para instalar la última versión de GitBook:

```
$ npm install -g gitbook-cli
$ gitbook versions:install latest
$ gitbook versions
```

#### Instalación de Calibre

Se necesita tener instalado Calibre para poder generar la documentación en formato PDF.

* [Descarga e instala Calibre](http://code.calibre-ebook.com/dist/osx)
* Añade Calibre al `PATH` de tu sistema (puedes añadirlo al `~/.zshrc`)

```
export PATH=$PATH:/Applications/calibre.app/Contents/MacOS
```

#### Actualizar documentación

Para facilitar la integración con GitBook se ha preparado el _shell script_ `./doc-build.sh` que realiza lo siguiente:

* Añade en el `./doc/<idioma>/README.md` la versión del `pom.xml` de tu proyecto o la versión indicada como parámetro y la fecha actual
* Genera páginas HTML
* Genera PDF

Por lo que si tienes instalado GitBook y Calibre en tu equipo según lo explicado anteriormente puedes ejecutar el _shell script_ `doc-build.sh` en tu equipo.

```
./doc-build.sh
```

Puedes insdicar la versión de la documentación a generar

```
./doc-build.sh 1.0.1
```

#### Configuración de GitBook

Si necesitas ayuda con GitBook, [tienes disponible su documentación](http://help.gitbook.com).

De todas formas aquí hay un pequeño resumen:

* La portada del pdf es la imagen `./doc/<idioma>/cover.jpg`
* Todos los .md tienen que estar enlazados en `./doc/<idioma>/SUMMARY.md`
* La generación de html y pdf se configura en el fichero `./doc/book.json`
* En la carpeta `./doc/<idioma>/styles/` se pueden modificar los ficheros CSS que configuran los estilos del PDF y HTML generados
* En el fichero `./doc/LANGS.md` se configuran los idiomas disponibles. Si quisieramos crear documentación en otro idioma (por ejemplo inglés), copiariamos la carpeta completa del idioma actual a otra carpeta con el código del nuevo idioma (en este caso `./doc/en/`), traduciríamos su contenido y añadiríamos lo siguiente al fichero `./doc/LANGS.md`:

```
* [English](en)
```
