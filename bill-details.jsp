<!DOCTYPE html>
<html>
<head>
    <title>Bill Details</title>
    <!-- Link to Bootstrap CSS for styling -->
    <link rel="stylesheet" href="<c:url value='/webjars/bootstrap/5.1.3/css/bootstrap.min.css' />">
</head>
<body>
    <div class="container">
        <h2>Bill Details</h2>
        <!-- Display bill information -->
        <p>User ID: ${bill.userId}</p>
        <p>Units Consumed: ${bill.unitsConsumed}</p>
        <p>Total Amount: ${bill.totalAmount}</p>
        <a href="/" class="btn btn-primary">Back to Home</a>
    </div>
</body>
</html>
