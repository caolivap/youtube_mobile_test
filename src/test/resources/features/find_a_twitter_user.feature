Feature:  Find a Twitter User
  I as twitter user
  Want to consult a user
  To see your tweets

  Scenario:  Find El Espectador tweets in Twitter
    Given that Carlos wants to see El Espectador tweets
    When He searchs El Espectador
    Then He should see that the first result belongs to @elespectador account

  Scenario Outline:  Find tweets in Twitter
    Given that <actor> wants to see Twitter user tweets
    When He searchs <Twitter user>
    Then He should see that the first result belongs to <User account> account
    Examples:
      | actor  | Twitter user             | User account         |
      | Susana | Alcaldía de Medellín     | @AlcaldiadeMed       |
      | Daniel | Coldplay ES              | @coldplay_es         |