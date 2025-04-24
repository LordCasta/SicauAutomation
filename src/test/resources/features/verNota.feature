# language : es

  Característica: Automatizar ver nota en sicau

  @SmokeTest

  Esquema del escenario: automatizar proceso de ver nota

  Dado que me encuentro en la pagina '<url>'

  Cuando inicie sesion con correo '<correo>' y contraseña '<contraseña>'

  Y seleccione ver notas

  Entonces visualizo la ventana con almenos la materia '<materia>'

  Ejemplos:
  | url | correo | contraseña | materia |
  ##@externaldata@parametros/Datos.xlsx@verNota
   |https://sicau.pascualbravo.edu.co/SICAU/Account/Login   |juan.castano166   |1018233166   |Grupo 001 ET0042 - CIRCUITOS DIGITALES|
