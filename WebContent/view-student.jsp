<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>

<title>Student Data</title>
</head>
<body>

<table border="1">

    <tr>
    
        <th>Student Name</th>
        
    
    </tr>


    <c:forEach var="list" items="${listOfStudent}">
    
      <tr>
      
          <td>${list}</td>
      
      </tr>
    
    </c:forEach>



</table>




</body>
</html>