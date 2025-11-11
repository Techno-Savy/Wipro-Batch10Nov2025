Agenda :
Functional Programming and pure functions . 
     why pure funtions:  where we focus on what to do rather then how to do
      traditional functions are for , foreach -- Here we were focussing on what to do but also on how to do (Logic)

Pure functions are  :-- map() , reduce() and filter()
    we can apply these functional methods like for salary tracking , log file manipulation etc..

Differences between these three:
common array elements are : [45000 , 56000 ,34000] 
map() => when we want to transform each element in an array and it returns a new array

        ==> for eg:  I want to return a new array after adding a 10% bonus on diwali but the actual length of an array will be same as the older one

filter() => when we want to select specific elements that meet a condition or when we want to extract the data
        ==> for eg: would like to return the salary which is greater 20000

reduce() => when we want to return a single value after accumulating array values that we have or you want to summarize or to get aggregate data
        ==> we want to calculate the total sum of 10 natural no's  sum += sum+n