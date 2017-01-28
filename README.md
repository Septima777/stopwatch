# stopwatch by Noppawan Kulchol (5910545728)

I run the task on a Acer, and got these results:

Task | Time
-------------------------------------------|-------: 
Append 50,000 chars to String | 1.121697 sec 
Append 100,000 chars to String | 4.517197 sec
Append 500,000 chars to String | 128.313982 sec
Append 50,000 chars to StringBuilder | 0.003229 sec
Append 100,000 chars to StringBuilder | 0.004040 sec
Append 500,000 chars to StringBuilder | 0.010290 sec
Add 5 million double using array | 0.039224 sec
Add 1 billion double using array | 2.377448 sec
Add 5 million Double using array | 0.191044 sec
Add 1 billion Double using array | 8.878390 sec
Add 5 million BigDecimal using array | 0.295533 sec
Add 1 billion BigDecimal using array | 13.538035 sec

## Explanation of Results

? Why does appending 100,000 chars to a String take more than 2X the time to append 50,000 chars?
  Answer : Appending 100,000 chars to a String take more than 2X the time to append 50,000 chars because when build the String that is object it will keep the String in the memories. Therefore, 100,000 chars is more than 50,000 chars it makes has more information in the memories. It also mean running the program of 100,000 chars spend time more than 50,000 chars. 

? Why is appending to StringBuilder so much different than appending to String? What is happening to the String?
  Answer : When build the String it keep information in one String
           Ex. String a = "A"
	   String b = "B"
	   a  = a + b  => "AB"
	   From Example in the memories has "A","B" and "AB". In the memories still have "A" ,"B" (it never lost) and have new String is "AB".But when build the StringBuilder it can keep infor	   mation both String and char. So, when it has many information, SringBuilder will keep it in char and the last it adds all in one String (save the memories).			                  
? Explain difference in time to sum double, Double, and BigDecimal. Which is faster and why?													   Answer : The time for running of primitive double is fastest because it is primitive.The time for running of Double (be object) is faster than BigDecimal because BigDecimal is so large to keep the information. It can keep the information more than float, double and Double.
																		              
? Why is there such a big difference in the time used to append chars to a String and to a StringBuilder? Even though we eventually "copy" the StringBuilder into a String so the final result is the same.
  Answer : Because the Strings keep the information in one String but StringBuilder keeps the information in chars that save the memories. So, the time for running of String builder is faster than String but the final result is the same.
																					                    


