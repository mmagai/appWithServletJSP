<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<style>
table {
	font-family: arial, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

td, th {
	border: 1px solid #dddddd;
	text-align: left;
	padding: 8px;
}

tr:nth-child(even) {
	background-color: #dddddd;
}
</style>
</head>
<body>

<img src="img_chania.jpg" alt="Flowers in Chania" width="600" height="34">
<h2>Student Data</h2>

<table border="1">
	<tr>
		<th>First Name</th>
		<th>Last Name</th>
		<th>Email</th>
	</tr>

	<c:forEach var="list" items="${studentList}">

		<tr>
			<td>${list.firstName}</td>
			<td>${list.lastName}</td>
			<td>${list.email}</td>
		</tr>

	</c:forEach>
</table>


</body>
</html>