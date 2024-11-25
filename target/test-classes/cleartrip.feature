@Cleartrip
Feature: cleartrip.com

Background: User book a Ticket
Given User Launch the Application "https://www.cleartrip.com/trains" 

Scenario: Book A Ticket

When User Enters Valid From Location 
When User Enters Valid To Location 
And User Selects Class from the dropdown
When User Selects Date from the Calander
When User Selects Adults from the dorpdown
And User Selects Children from the dropdown
When User Selects Senior men from the dropdown
When User Selects Senior women from the dropdown
When User Clicks On Search Trains
And User Sign In to Clear Trip
Then User Takes a ScreenShot1


Scenario: Book A Ticket with 1D List

When User Enters Valid From Location with 1D List
|Hyderabad|Tirupathi|Kadapa|
When User Enters Valid To Location 
And User Selects Class from the dropdown
When User Selects Date from the Calander
When User Selects Adults from the dorpdown
And User Selects Children from the dropdown
When User Selects Senior men from the dropdown
When User Selects Senior women from the dropdown
When User Clicks On Search Trains
And User Sign In to Clear Trip

Then User Takes a ScreenShot2

@Outline

Scenario Outline: Book A Ticket with outline
When User Enters Valid From Location "<From>"
When User Enters Valid To Location "<To>"
And User Selects Class from the dropdown 
When User Selects Date from the Calander 
When User Selects Adults from the dorpdown "<Adults>"
And User Selects Children from the dropdown "<Children>"
When User Selects Senior men from the dropdown "<Men>"
When User Selects Senior women from the dropdown "<Women>"
When User Clicks On Search Trains
And User Sign In to Clear Trip
Then User Takes a ScreenShots "<ScreenShot3>"
Examples:
|From     |To        |Adults   |Children|Men      |Women    |ScreenShot3|
|Chennai  |Bangalore |1        |1       |1        |1        |Shot1      |
|Hyderabad|Chennai   |2        |2       |2        |2        |Shot2      |
|Tirupathi|Chennai   |3        |3       |3        |3        |Shot3      |
|Kadapa   |Hyderabad |4        |4       |4        |4        |Shot4      |



