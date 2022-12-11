Feature:  Deatiled Filter

  Background: Deatiled Filter
    Given user navigates to login page
    When user logins the page
    And click on Raporlar
    And click on Araç Bazlı Rapor
    And click on Araç Sec
    Then clicks on Baslangic Tarihi
    And choose 2021-01-01 from dropdown menu
    Then click  on Rapor al
    And click on Detayli Filtre

  Scenario: verify writings and placeholders

    Then verify Tarih writing
    Then verify Ise Baslama writing
    Then verify Is Bitis writing
    And verify Tarih placeholder
    Then verify Ise Baslama placeholder
    And verify Is Bitis placeholder

  Scenario Outline: Date filter
    Given user sends input as "<date>"
    Then user verifies <result> filtered result with date "<date>"
    Examples:
      | date       | result |
      | 2022       | 1      |
      | 2021-11    | 7      |
      | 2021-11-05 | 1      |

  Scenario Outline: Date filter with ise baslama
    Then user verifies filtered result with date and ise baslama "<ise baslama>"
    Then user verifies filtered result with date and is bitis "<is bitis>"

    Examples:
      | ise baslama | is bitis |
      | 11:         | 22:      |
      | 12:         | 23:      |
      | 12:09       | 23:59    |
      | 12:09:07    | 23:59:18 |


