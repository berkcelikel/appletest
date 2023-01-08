Feature: Apple Test project

  @Regression @Smoke
  Scenario:
    Given Nagivgate to apple.com
    And Click to mobile phone
      | ipad |
      | pro  |
    And Click to buy
      | buy |
    And Chose the info
      | inch         |
      | color        |
      | gb           |
      | Connectivity |
      | engraving    |
      | pencil       |
      | keyboard     |
      | notrade      |
      | cashbuy      |
      | nocare       |

    And Add to Bag
      | bag       |
      | reviewbag |

    And Select Value
      | add | 3 |

    And Scrool
      | checkout |
      | guest    |

    And Code Write
      | zipcode | 71601 |

    And Add to Bag
      | zipcodeapply |

    And Checkout
      | shippingadress |

    And Code Write
      | firstname | John             |
      | lastname  | Den              |
      | street    | 52               |
      | building  | saf              |
      | email     | deneme@gmail.com |
      | phone     | 6564659855       |

    And Add to Bag
      | payment          |
      | useadress        |
      | creditcardbutton |

    And Code Write Scrool
      | card       | 6465498794569856 |
      | expiration | 03/26            |
      | cvv        | 254              |

    And Add to Bag
      | rewieww |

    And Check the Delivery
      | checkdelivers |








