'use strict';

module.controller('MateriaCtrl', ['$scope', '$filter', '$http', function ($scope, $filter, $http) {
        //listar
        $scope.lista = materias;
        $scope.datosFormulario = {};
        $scope.datosHorario = {};
        $scope.panelEditar = false;
        $scope.listaCarreras = carreras;
        $scope.listaProfesores = profesores;

        //guardar
        $scope.nuevo = function () {
            $scope.panelEditar = true;
            $scope.datosFormulario = {};
        };

        $scope.guardar = function () {
            var index = $scope.lista.indexOf($scope.datosFormulario);
            if (index === -1) {
                $scope.datosFormulario.id = idMateria++;
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
        //eliminar
        $scope.eliminar = function (data) {
            if (confirm('\xbfDesea elminar este registro?')) {
                var index = $scope.lista.indexOf($scope.datosFormulario);
                if (index > -1) {
                    $scope.lista.splice(index, 1);
                }
            }
        };
        
         //guardar
        $scope.nuevoHorario = function () {
            $scope.datosHorario = {};
        };

        //guardar
        $scope.guardarHorario = function () {
            var index = $scope.datosFormulario.listaHorarios.indexOf($scope.datosHorario);
            if (index === -1) {
                $scope.datosHorario.id = idHorario++;
                $scope.datosFormulario.listaHorarios.push($scope.datosHorario);
            }
        };
        $scope.cancelarHorario = function () {
            $scope.datosHorario = {};
        };

        //editar
        $scope.editarHorario = function (data) {
            $scope.datosHorario = data;
        };
        //eliminar
        $scope.eliminarHorario = function (data) {
            if (confirm('\xbfDesea elminar este registro?')) {
                var index = $scope.listaHorarios.indexOf($scope.datosHorario);
                if (index > -1) {
                    $scope.listaHorarios.splice(index, 1);
                }
            }
        };
        
        $scope.verHorarios = function (data) {
            $scope.datosFormulario = data;
        };
    }]);