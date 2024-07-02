Feature: User add new books to the system
  In order to test user can register books successfully
  Scenario Outline: User register books to his account and see them added successfully
    Given User is navigate to Home page <title1>
   # And User see the Registration page <title2>
    And User click the Registration Tab
    And User see the Registration page <title2>
    And User enter the book Name <name>
    And User enter name of the Author <author>
    And User enter price of the book <price>
    Then User press Submit Button
   # Then User sees the available books page <title3>



    Examples:
    #Correct data
      |title1|title2 |name|author|price|
      |Book Store|Book Register|Guitar|Mihinula|150|
     # |Book Store|Book Register|The Ball|Thisu|100|
      # Incorrect data
     # |Book Store|Book Register|AAA|BBB|CCC|

