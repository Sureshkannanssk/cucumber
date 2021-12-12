Feature: To validate the login functionality of fb applicaion

#Background:
#Given : To launch the chrome browser and maximize

@Invalidname
Scenario: To validate the login with invalid password and invalid username 
   
   When : To launch the url
   And : To pass the invalid name in Name Textbox
   And : To pass the invalid value in password Textbox
   And : To click the login button
   And : To check whether its navigate to homepage or not

#@Validname
#Scenario Outline:To validate the login with valid password and valid username 
   #When : To launch the url of fb
   #And : To pass the valid name"<Email>" in Name Textbox
   #And : To pass the valid value"<Password>" in password Textbox
   #And : To click the login button of fb
   #And : To check whether its navigate to homepage or not check
     #
   #
 #Examples:
#|Email                  |  Password |
#|surekhan619@gmail.com  |sureshfacebook9551994651|
#|surehepsi@gmail.com    |123456|
#|sure@gmail.com         |1678edr|
#|kannan@gmail.com       |89838|
  #
  #
  @Datatable
  Scenario: To validate the login with datatable password and invalid username 
   When : To launch the url db
   And : To pass the valid name in Name Textbox db
   
   | email1 | sure@gmail.com | 
   | email2 | sursse@gmail.com | 
   
   And : To pass the valid value in password Textbox db
   
   |pass1|pass2|pass3|
   |1234 |134  |145  |
   |2567 |343  |111  |
   |1327 |213  |241  |
   
   And : To click the login button db
   
  










