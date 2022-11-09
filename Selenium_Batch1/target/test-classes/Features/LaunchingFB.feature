Feature: Launching FB Login

Scenario Outline: Login to Facebook Account

Given The Facebook website launch
When Check user id and password field present
Then Enter user "<userid>" and "<password>"
And Close browser
Examples:
| userid | password |
| testuser_1 | Test@153 |
| testuser_2 | Test@143 |

