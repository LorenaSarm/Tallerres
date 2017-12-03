'use strict';

module.controller('MatriculaCtrl', ['$scope', '$filter', '$http', function ($scope, $filter, $http) {
        //listar
        $scope.lista = matriculas;
        $scope.datosFormulario = {};
        $scope.datosMateria = {};
        $scope.panelEditar = false;
        $scope.listaMaterias = materias;
        $scope.listaEstudiantes = estudiantes;

        //guardar
        $scope.nuevo = function () {
            $scope.panelEditar = true;
            $scope.datosFormulario = {};
        };

        $scope.guardar = function () {
            var index = $scope.lista.indexOf($scope.datosFormulario);
            if (index === -1) {
                $scope.datosFormulario.id = idMatricula++;
                $scope.lista.push($scope.datosFormulario);
            }
            $scope.panelEditar = false;
        };
        $scope.cancelar = function () {
            $scope.panelEditar = false;
            $scope.datosFormulario = {};
        };

        //editar
        $scope.editar = function (data) {
            $scope.panelEditar = true;
            $scope.datosFormulario = data;
        };
        
        //guardar
        $scope.nuevoHorario = function () {
            $scope.datosHorario = {};
        };

        //guardar
        $scope.guardarMateria = function () {
            if (!$scope.datosFormulario.listaMaterias) {
                $scope.datosFormulario.listaMaterias = [];
            }
            var index = $scope.datosFormulario.listaMaterias.indexOf($scope.datosHorario);
            if (index === -1) {
                if (!$scope.datosFormulario.idMaterias) {
                    $scope.datosFormulario.idMaterias= 0;
                }
                $scope.datosFormulario.idMaterias = $scope.datosFormulario.idMaterias + 1;
                $scope.datosMateria.id = $scope.datosFormulario.idMaterias;
                $scope.datosFormulario.listaHorarios.push($scope.datosHorario);
            } else {
                if (!$scope.datosFormulario.idMaterias) {
                    $scope.datosFormulario.idMaterias= 0;
                }
                $scope.datosFormulario.idMaterias = $scope.datosFormulario.idMaterias + 1;
                $scope.datosMateria.id = $scope.datosFormulario.idMaterias;
                $scope.datosFormulario.listaHorarios.push($scope.datosHorario);
            }
        };
        
        $scope.guardarHorario = function(data) {
                            
        };
        
        $scope.cancelarMateria = function () {
            $scope.datosMateria = {};
        };

        //eliminar
        $scope.eliminar = function (data) {
            if (confirm('\xbfDesea elminar este registro?')) {
                var index = $scope.lista.indexOf($scope.datosFormulario);
                if (index > -1) {
                    $scope.lista.splice(index, 1);
                }
            }
        };
        
        $scope.verMaterias = function (data) {
            $scope.datosFormulario = data;
        };
    }]);


