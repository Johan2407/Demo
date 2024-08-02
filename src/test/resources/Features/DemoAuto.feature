@Demo-auto
  Feature: Test Demo Automation

    Scenario Outline: Capacitacion de automatizacion
      Given Ingresamos a la URL del <ambiente>,<estable>
      And Ingresamos <usuario>, <contrasena>
      Then Seleccionamos Generate token
      And Seleccionamos idioma <idioma>
      And Seleccionamos el menu
      And Seleccionamos submenu <submenu>
      And Seleccionamos modulo <modulo>
      And Seleccionamos el menu hamburguesa
      Then Seleccionamos limpiar filtro

    Examples:
      | ambiente | estable | usuario                     | contrasena | idioma | submenu     | modulo      |
      | QA       | Yes     | rosario.chale@intelica.com  | depapym    | ESP    | M&V Billing | Brand Files |
      | UAT      | Yes     | kevin.silva@intelica.com    | depapym    | ESP    | M&V Billing | Brand Files |
      | UAT      | No      | johan.carbonel@intelica.com | MIabc24$   | ESP    | M&V Billing | Brand Files |