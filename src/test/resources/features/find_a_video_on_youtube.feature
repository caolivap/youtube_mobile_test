Feature:  Find Videos on Youtube
  I as user
  Want to consult a video
  To see and listen music

  Scenario:  Find a Heavy Metal Video on Youtube
    Given that Juan wants to search a Video
    When He searchs Spit Out the Bone
    Then He should see that the first video belongs to Metallica Band

  Scenario Outline:  Find Videos on Youtube
    Given that <actor> wants to search a Video
    When He searchs <nameSong>
    Then He should see that the first video belongs to <nameBand> Band
    Examples:
      | actor  | nameSong     | nameBand         |
      | Susana | Paid in Full | Sonata Arctica   |
      | Daniel | Soldier Side | System Of A Down |