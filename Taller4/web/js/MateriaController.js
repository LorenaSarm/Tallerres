'use strict';

module.controller('MateriaCtrl', ['$scope', '$filter', '$http', function ($scope, $filter, $http) {
        //listar
        $scope.lista = materias;
        $scope.datosFormulario = {};
        $scope.datosHorario = {};
        $scope.panelEditar = false;
        $scope.panelEditarHorario = false;
        $scope.panelVerHorario = false;
        $scope.listaCarreras = carreras;
        $scope.listaProfesores = profesores;
        $scope.listaHorarios = horarios;

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
        //ver horarios
        $scope.ver = function (data) {
            $scope.panelVerHorario = true;
            $scope.datosHorario = data;
        };
        
         //guardar
        $scope.nuevoHorario = function () {
            $scope.panelVerHorario = false;
            $scope.panelEditarHorario = true;
            $scope.datosHorario = {};
        };

        $scope.guardarHorario = function () {
            var index = $scope.listaHorarios.indexOf($scope.datosHorario);
            if (index === -1) {
                $scope.datosHorario.id = idHorario++;
                $scope.listaHorarios.push($scope.datosHorario);
            }
            $scope.panelEditarHorario = false;
        };
        $scope.cancelarHorario = function () {
            $scope.panelEditarHorario = false;
            $scope.datosHorario = {};
        };

        //editar
        $scope.editarHorario = function (data) {
            $scope.panelVerHorario = false;
            $scope.panelEditarHorario = true;
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
        
        $('#timepicker1').timepicker();
        $('#timepicker2').timepicker();
    }]);