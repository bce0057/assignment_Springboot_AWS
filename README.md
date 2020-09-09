# assignment_Springboot_AWS
product service, coupon service, cart

1. Create a Product Service - /product

a) create POST endpoint and add below products to Database

{
	product: "Pen",
	productCode: "PEN",
	price: 50

},

{
	product: "Pencil",
	productCode: "PNC",
	price: 5

},

{
	product: "Ink",
	productCode: "INK",
	price: 20

},

{
	product: "Notebook",
	productCode: "NTB",
	price: 50

},


b) Create a GET endpoint to get all products and another GET endpoint to get a specific product by productCode.



2) Create a Coupon service - /coupon
	a) create a POST endpoint and add below coupons:
		{ couponCode: "50OFF"},
		{ couponCode: "25OFF"},
		{ couponCode: "15OFF"}
	b) create a GET endpoint to get a specific couponCode.

3) Create a Cart service /cart


	a) create a GET endpoint 
		hit Product endpoint with array of products["NTB", "INK"] and get the total price
		hit Coupon endpoint with code 15OFF
		deduct 15% from total price calculated above
		return discounted price.

	{
	products: ["NTB", "INK"],
	couponCode: "15OFF"
	}








