#Feature: UMS
#
#@tag1
#Scenario Outline: Employee page
#Then user checks the employees page "<Firstname>" "<Lastname>" "<ID>" "<Email>"
#
#Examples:
#| Firstname | Lastname | ID        | Email                |
#| Symbol    | S        | Symbol001 | symbol@ikcontech.com |
#Feature: UMS
#
  #@tag1
  #Scenario Outline: Employee page
    #And add the employee profile "<FN>" "<LN>" "<EID>" "<Email>" "<DN>" "<DSN>" "<FNs>" "<GN>"
    #Then validate the added employees "<FN>" "<LN>" "<EID>" "<Email>" "<DN>" "<DSN>" "<FNs>" "<GN>"
    #Then update the employee profile "<FN>" "<LN>" "<EID>" "<Email>" "<DN>" "<DSN>" "<FNs>" "<GN>"
    #Then validate the updated employess "<FN>" "<LN>" "<EID>" "<Email>" "<DN>" "<DSN>" "<FNs>" "<GN>"
    #Then delete the employee "<Email>"
#
    #Examples: 
      #| FN      | LN | EID     | Email                 | DN                     | DSN         | FNs      | GN   |
      #| Munawar | S  | IKMU012 | Munawar@ikcontech.com | Information Technology | Team Member | Charan U | Male |
