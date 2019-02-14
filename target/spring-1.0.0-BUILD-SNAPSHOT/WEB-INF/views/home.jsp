<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@ page session="false"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="keywords" content="">
<meta name="description" content="">
<meta name="viewport" content="initial-scale=1">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
<title>QuickStart</title>
<style type="text/css">
.empty-table {
	color: rgb(127, 127, 127);
	text-align: center;
	margin-top: 50px;
}
</style>
</head>
<body>
<nav class="navbar navbar-dark bg-primary mb-3"> <a
		href="${pageContext.request.contextPath}/"
		class="navbar-brand">QuickStart</a> </nav>
	<div class="container-fluid">
		<br />
		<div class="row">
			<div class="col-sm-7">
				<table class="table">
					<thead class="thead-dark">
						<tr>
							<th scope="col">name</th>
							<th scope="col">lastName</th>
							<th scope="col">address</th>
							<th scope="col">Email</th>
							<th scope="col">phone</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${clients}" var="client">
						<tr>
							<th scope="row"><c:out value="${client.clientName}" /></th>
							<td><c:out value="${client.clientLastName}" /></td>
							<td><c:out value="${client.clientAddress}" /></td>
							<td><c:out value="${client.clientEmail}" /></td>
							<td><a
								href="${pageContext.request.contextPath}/delete/${client.clientName}"
								class="btn btn-danger">suppr</a> <a
								href="${pageContext.request.contextPath}/edit/${client.clientName}"
								class="btn btn-primary">edit</span></a></td>
								</tr>
						</c:forEach>
					</tbody>
				</table>
				<c:if test="${isEmpty}">
					<h4 class="empty-table">
						<b>Student table is Empty</b>
					</h4>
				</c:if>
			</div>
			<div class="col-sm-5">
				<div class="jumbotron">
					<h4 class="text-center text-primary">New Client</h4>
					<hr>
					<f:form cssClass="form" modelAttribute="client"
						action="${pageContext.request.contextPath}/add">
						<div class="form-group">
							<f:input path="clientName" type="text" name="cientName"
								cssClass="form-control" placeholder="Your first name" />
						</div>
						<div class="form-group">
							<f:input path="clientLastName" type="text"
								name="clientLastName" cssClass="form-control"
								placeholder="your Last Name" />
						</div>
						<div class="form-group">
							<f:input path="clientEmail" type="text" name="clientEmail"
								cssClass="form-control" placeholder="Email" />
						</div>
						<div class="form-group">
							<f:input path="clientPhone" type="text" name="clientPhone"
								cssClass="form-control" placeholder="Phone Number" />
						</div>
						<input type="submit" value="add" class="btn btn-primary">
						<input type="reset" class="btn btn-danger">
					</f:form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
