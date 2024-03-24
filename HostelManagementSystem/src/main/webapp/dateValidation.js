function validateForm() {
	// Read the form data
	var Check_in_date = document.getElementById("Check_in_date").value;
	var Check_out_date = document.getElementById("Check_out_date").value;
	let myImage = document.getElementById("aadharImage");
  	myImage.setAttribute("src", "/images/my-image.jpg");

	
	// Check all fields datas are present or not 
	if (Check_in_date.trim() === "" || Check_out_date.trim() === "" || myImage.trim() === "" ) {
		alert("Please enter all values");
		return false;
	}

	// Check name and brand are less than 50 characters or not
	if (prodName.length > 50 || prodBrand.length > 50) {
		alert("Name or Brand can't be more than 50 characters..")
		return false;
	}

	// Check if Price is negative value
	if(parseFloat(prodPrice)<0){
		alert("Price can't be a Negative value...")
		return false;
	}
	// Converting date of String format to date format
	var mfgDate = new Date(prodMfgDate);
	var expDate = new Date(prodExpDate);

	// Checking Manufacturing date is less than Expiry date or not
	if (mfgDate > expDate) {
		alert("Manufacturing date can't be more than Expiry Date..");
		return false;
	}

	return true;
}