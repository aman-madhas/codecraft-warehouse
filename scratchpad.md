Customers can buy CDs, searching on the title and the
artist. Their credit card payment is processed by an external provider. Record labels send batches of CDs to the warehouse. Keep a
stock count of how many copies of each title are in the warehouse.
Customers can leave reviews for CDs they’ve bought through the
warehouse, which gives each title an integer rating from 1- 10 and
the text of their review if they want to say more.

Use cases are:
Customer 
- Buy CD: Scenarios are: 
A) In stock, and payment is accepted then stock goes down by 1 and card is charged price of CD. 
B) In stock, and payment is declined then stock remains unchanged. 
C) Not in stock then no payment is taken and stock remains unchanged. 
- Search for CD
A) Search by Artist
	- No results
	- With results
B) Search by Title
	- No results
	- With results
- Review a CD that they have bought
A) Rating 1-10
B) Optional text review


Record label
- Restock (send batches of CDs)
A) Title, Artist and StockCount

Warehouse
- Title and count
- Artist for title