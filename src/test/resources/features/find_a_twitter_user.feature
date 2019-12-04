Feature:  Find a Twitter User
  I as twitter user
  Want to consult a user
  To see your tweets

  Scenario:  Find El Espectador tweets in Twitter
    Given that Carlos wants to see Twitter users
    When He searchs El Espectador
    Then He should see that the first result belongs to @elespectador account

  Scenario Outline:  Find tweets in Twitter
    Given that <actor> wants to see Twitter users
    When He searchs <twitterUser>
    Then He should see that the first result belongs to <userAccount> account
    Examples:
      | actor  | twitterUser              | userAccount          |
      | Susana | Alcaldía de Medellín     | @AlcaldiadeMed       |
      | Daniel | Coldplay ES              | @coldplay_es         |