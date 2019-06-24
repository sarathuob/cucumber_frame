$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("searchRestaurant.feature");
formatter.feature({
  "line": 1,
  "name": "Use the website to find restaurants",
  "description": "         So that I can order food\r\n         As a hungry customer\r\n         I want to be able to find restaurants in my area",
  "id": "use-the-website-to-find-restaurants",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8620070000,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Search for restaurants in an area",
  "description": "",
  "id": "use-the-website-to-find-restaurants;search-for-restaurants-in-an-area",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@first"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I want food in \"AR51 1AA\"",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I search for restaurants",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I should see some restaurants in \"AR51 1AA\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "AR51 1AA",
      "offset": 16
    }
  ],
  "location": "searchRestaurant.i_want_food_in(String)"
});
formatter.result({
  "duration": 3142356800,
  "status": "passed"
});
formatter.match({
  "location": "searchRestaurant.i_search_for_restaurants()"
});
formatter.result({
  "duration": 20684166000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AR51 1AA",
      "offset": 34
    }
  ],
  "location": "searchRestaurant.i_should_see_some_restaurants_in(String)"
});
formatter.result({
  "duration": 1132305000,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Click the first restaurant to place order",
  "description": "",
  "id": "use-the-website-to-find-restaurants;click-the-first-restaurant-to-place-order",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@second"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "Restaurants lists are displayed",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "I click on the first restaurant title",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "I should redirect to the menu page for that restaurant",
  "keyword": "Then "
});
formatter.match({
  "location": "searchRestaurant.restaurants_lists_are_displayed()"
});
formatter.result({
  "duration": 699472500,
  "status": "passed"
});
formatter.match({
  "location": "searchRestaurant.i_click_on_the_first_restaurant_title()"
});
formatter.result({
  "duration": 5488107000,
  "status": "passed"
});
formatter.match({
  "location": "searchRestaurant.i_should_redirect_to_the_menu_page_for_that_restaurant()"
});
formatter.result({
  "duration": 87421000,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Verify the help page",
  "description": "",
  "id": "use-the-website-to-find-restaurants;verify-the-help-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 17,
      "name": "@third"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "user redirect to Help page",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "help page is displayed",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "verify buttons displayed in the help file",
  "keyword": "Then "
});
formatter.match({
  "location": "searchRestaurant.menu_page_for_that_restaurant_displayed()"
});
formatter.result({
  "duration": 3505179100,
  "status": "passed"
});
formatter.match({
  "location": "searchRestaurant.verify_all_the_three_tabs_are_displayed()"
});
formatter.result({
  "duration": 56028700,
  "status": "passed"
});
formatter.match({
  "location": "searchRestaurant.verify_the_category_tab_displayed_or_not()"
});
formatter.result({
  "duration": 125089400,
  "status": "passed"
});
formatter.after({
  "duration": 1314195100,
  "status": "passed"
});
});