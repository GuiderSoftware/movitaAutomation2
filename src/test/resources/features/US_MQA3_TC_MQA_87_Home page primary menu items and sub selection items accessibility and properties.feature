Feature: Home page primary menu items and sub selection items accessibility and properties.

  Scenario: Header menu items accessibility and properties.
    Given Navigate to URL
    Then  Primary menu items visibility
    When  Hover over “ANA SAYFA” changes color and clickable
    And   Click “ANA SAYFA"
    When  Hover over “KURUMSAL” changes color
    Then  See list items under “KURUMSAL” menu item
    When  Hover over “ÜRÜNLER” changes color
    Then  See list items under “ÜRÜNLER” menu item
    When  Hover over “ÇÖZÜMLER” changes color
    Then  See list items under “ÇÖZÜMLER” menu item
