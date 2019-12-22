# GetMaxProfitFromStock

  
 
Scenario
Suppose we could access yesterday's stock prices as a list, where:

The indices are the time in minutes past trade opening time, which was 10:00am local time.
The values are the price in dollars of the Latitude Financial stock at that time.
So if the stock cost $5 at 11:00am, stock_prices_yesterday[60] = 5.
Write an efficient function that takes an array of stock prices and returns the best profit I could have made from 1 purchase and 1 sale of 1 Latitude Financial stock yesterday.

For example:

var stock_prices_yesterday = [10, 7, 5, 8, 11, 9];

get_max_profit(stock_prices_yesterday)
returns 6 (buying for $5 and selling for $11)
You must buy before you sell. You may not buy and sell in the same time step (at least 1 minute must pass).

Expectations
implement a solution in any language
provide code that runs and prove it works (i.e. show something that can be run / or automated tests)
include any comments that you think will be relevant to provide any context around the approach taken / solution developed
@vikky225
 
Leave a comment
Attach files to your comment
Attach files by dragging & dropping, selecting or pasting them.
© 2019 GitHub, Inc.
Terms
Privacy
Security
Status
Help
Contact GitHub
Pricing
API
Training
Blog
About

# How to run Program 
 Please clone project in your favourite Ide eclispse or Intellij and run main program i.e. GetMaxProfitFromStockMain.java 
 or run with cmd as alternative
 
# output get as below from the program as expected
max price is (for selling) 11  index is 4
min price is (for buying) 5   index is 2
maximum profit is 6


# Design Solution



Design solution is pretty stratefarward we get max and min from array along with corrosponding index and find the difference if condition satisfied to get profit and if not than we slice array from min value index  to lengeth of array and send it recursively for calculation. 

Worst case time complexity if it goes in recursively loop may be O(n*y) where y is number of times it goes in recursion. 
For iterating over we have not used external iterator which is overhead in imperative style of programming and to boot perfomance we are using java 8 stream api for getting max and min along with respective indexes which gives better and faster access and same is applicable while slicing array as well. 

# Test
We have simulated case given in example only 
i.e stock_prices_yesterday = [10, 7, 5, 8, 11, 9];







