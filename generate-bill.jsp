<!DOCTYPE html>
<html>
<head>
    <title>Generate Bill</title>
    <!-- Link to Bootstrap CSS for styling -->
    <link rel="stylesheet" href="<c:url value='/webjars/bootstrap/5.1.3/css/bootstrap.min.css' />">
</head>
<body>
    <div class="container">
        <h2>Generate Electric Bill</h2>
        <!-- Form to input user ID and units consumed -->
        <form action="/generate-bill" method="post">
            <div class="mb-3">
                <label for="userId" class="form-label">User ID</label>
                <input type="text" class="form-control" id="userId" name="userId" required>
            </div>
            <div class="mb-3">
                <label for="unitsConsumed" class="form-label">Units Consumed</label>
                <input type="number" class="form-control" id="unitsConsumed" name="unitsConsumed" required>
            </div>
            <button type="submit" class="btn btn-primary">Generate Bill</button>
        </form>
    </div>
</body>
</html>
