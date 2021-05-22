Feature: Applying for a job
  @Task1
  Scenario: Applying for a job as a lead product tester
    Given the applicant search "Roof Stack Yazılım" site on google
    When the applicant go to the desired page
    And the applicant navigate to career tab
    And the applicant select "Lead Product Tester" position
    Then verify selection
    When the applicant upload CV
    Then the applicant apply for correct position
