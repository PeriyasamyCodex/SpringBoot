var app = angular.module("UserManagement", []);

	//Controller

	app.controller("EmployeeController", function($scope, $http) {

		$scope.employees = [];
		
		 $scope.employeeForm = {
				 empId : -1,
				 empFirstName : "",
				 empEmail : ""
             };
		
	
		//Refresh Employee Data 
		refreshEmployeesData();

		function refreshEmployeesData() {
			
			$http({
				method : 'GET',
				url : 'http://localhost:8080/api/employee/empList'
			}).then(function successCallback(response) {
				$scope.employees = response.data;
			}, function errorCallback(response) {
				console.log(response.statusText);
			});
		}
		
		$scope.editEmployee = function(employee) {
			
			$scope.employeeForm.empFirstName=employee.empFirstName
			$scope.employeeForm.empEmail=employee.empEmail
			$scope.employeeForm.empId=employee.empId
		};
		
		$scope.deleteEmployee = function(employee) {
			
			$http({
				method: 'DELETE',
				url : 'http://localhost:8080/api/employee/remove',
				data : angular.toJson(employee),
				headers : {
					'Content-Type' : 'application/json'
				}				
			}).then(success,error);			
		};
		
		function success(response) {
			refreshEmployeesData();
            clearFormData();
        }
 
        function error(response) {
            console.log(response.statusText);
        }
        
        function clearFormData() {
            $scope.employeeForm.empId = -1;
            $scope.employeeForm.empFirstName = "";
            $scope.employeeForm.empEmail = "";
        
        };
        
        $scope.submitEmployee = function() {
            
            var method = "";
            var url = "";
            if ($scope.employeeForm.empId == -1) {
                //Id is absent in form data, it is create new customer operation
                method = "POST";
                url = 'http://localhost:8080/api/employee/add';
            } else {
                //Id is present in form data, it is edit customer operation
                method = "PUT";
                url = 'http://localhost:8080/api/employee/update';
            }
 
            $http({
                method : method,
                url : url,
                data : angular.toJson($scope.employeeForm),
                headers : {
                    'Content-Type' : 'application/json'
                }
            }).then( success, error );
        };
		

	});
	
	
	 //Controller

	app.controller("CustomerController", function($scope, $http) {

		$scope.customers = [];
		
		 $scope.customerForm = {
				 custId : -1,
				 custFirstName : "",
				 custEmail : ""
             };
		
	
		//Refresh  Data 
		 refreshsCustomerData();

		function refreshsCustomerData() {
			
			$http({
				method : 'GET',
				url : 'http://localhost:8080/api/customer/custList'
			}).then(function successCallback(response) {
				$scope.customers = response.data;
			}, function errorCallback(response) {
				console.log(response.statusText);
			});
		}
		
		$scope.editCustomer = function(customer) {
			
			$scope.customerForm.custFirstName=customer.custFirstName
			$scope.customerForm.custEmail=customer.custEmail
			$scope.customerForm.custId=customer.custId
		};
		
		$scope.deleteCustomer = function(customer) {
			
			$http({
				method: 'DELETE',
				url : 'http://localhost:8080/api/customer/remove',
				data : angular.toJson(customer),
				headers : {
					'Content-Type' : 'application/json'
				}				
			}).then(success,error);			
		};
		
		function success(response) {
			refreshsCustomerData();
            clearFormData();
        }
 
        function error(response) {
            console.log(response.statusText);
        }
        
        function clearFormData() {
            $scope.customerForm.custId = -1;
            $scope.customerForm.custFirstName = "";
            $scope.customerForm.custEmail = "";
        
        };
        
        $scope.submitCustomer = function() {
            
            var method = "";
            var url = "";
            if ($scope.customerForm.custId == -1) {
                //Id is absent in form data, it is create new customer operation
                method = "POST";
                url = 'http://localhost:8080/api/customer/add';
            } else {
                //Id is present in form data, it is edit customer operation
                method = "PUT";
                url = 'http://localhost:8080/api/customer/update';
            }
 
            $http({
                method : method,
                url : url,
                data : angular.toJson($scope.customerForm),
                headers : {
                    'Content-Type' : 'application/json'
                }
            }).then( success, error );
        };
        
        
	});