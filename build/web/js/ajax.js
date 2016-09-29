/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


$(document).ready(function () {
    $("#btnLogin").click(function () {
        $.ajax({
            method: "post",
            url: "ServletLogin",
            data: {
                usuario: $("#usuario").val(),
                clave: $("#clave").val()
            }
        }).done(function (msg) {
            if (msg === "entro") {
                window.location.href = "paginaPrincipal.jsp";
            } else if (msg === "admin") {
                window.location.href = "personal.jsp";

            } else {
                swal("Error!", msg, "error");
            }

        });

    });

    $(document).ready(function () {
        $("#btnRegistro").click(function () {
            $.ajax({
                method: "post",
                url: "ServletInsertUser",
                data: {
                    users: $("#usuarioRegisro").val(),
                    password: $("#claveRegistro").val(),
                    confirmPassword: $("#confirmarClave").val()
                }
            }).done(function (mr) {
                if (mr === "Usuario Registrado") {
                    swal("Excelente", mr, "success");
                }
                swal("Error!", mr, "error");
            });

        });
    });


    $("#btnGuardarPersonas").click(function () {
        $.ajax({
            method: "post",
            url: "ServletAddEmployee",
            data: {
                name: $("#nombreUsuario").val(),
                lastName: $("#apellidoUsuario").val(),
                documentType: $("#tipoDocUsuario").val(),
                documentNumber: $("#numDocumentoUsuario").val(),
                userType: $("#tipoUsuario").val(),
                telephone: $("#telefonoUsuario").val(),
                email: $("#correoUsuario").val(),
                address: $("#direccionUsuario").val()
            }
        }).done(function (m) {
            if (m === "Empleado insertado correctamente") {
                swal("Excelente!", m, "success");
            } else {
                swal("Error!", m, "error");
            }
        });
    });


    $("#btnGuardarArbitros").click(function () {
        $.ajax({
            method: "post",
            url: "ServletAddReferee",
            data: {
                name: $("#nombreArbitro").val(),
                lastName: $("#apellidoArbitro").val(),
                documentType: $("#tipoDocArbitro").val(),
                documentNumber: $("#numDocumentoArbitro").val(),
                position: $("#posicionArbitro").val(),
                telephone: $("#telefonoArbitro").val(),
                email: $("#correoArbitro").val(),
                address: $("#direccionArbitro").val()
            }
        }).done(function (ms) {
            if (ms !== "Arbritro insertado correctamete") {
                swal("Excelente!", ms, "success");
            }
            swal("Excelente!", "Arbitro insertado", "success");
        });
    });

    $(".btnGuardarImplementos").click(function () {
        $.ajax({
            method: "post",
            url: "ServletAddImplements",
            data: {
                code: $("#codigoI").val(),
                name: $("#nombreI").val(),
                brand: $("#marcaI").val(),
                description: $("#descripcionI").val(),
                quantity: $("#cantidadI").val(),
                state: $("#estadoI").val()
            }
        }).done(function (r) {
            if (r === "Se Inserto Correctamente") {
                swal("Excelente!", "Se Inserto Correctamente", "success");
            } else {
                swal("Error!", r, "error");
            }
        });
    });

    $(".btnCrearTorneo").click(function () {
        $.ajax({
            method: "post",
            url: "ServletAddTournament",
            data: {
                name: $("#nombreT").val(),
                sport: $("#idDeporte").val(),
                startDate: $("#fechaIni").val(),
                finishDate: $("#fechaFin").val(),
                description: $("#descripcion").val(),
                idUser: $("#encargado").val()
            }
        }).done(function (res) {
            if (res === "Torneo Creado Exitosamente") {
                swal("Excelente!", res, "success");
            } else {
                swal("Error!", res, "error");
            }

        });
    });

    $(".btnEliminarTorneos").click(function () {
        var id = $(this).val();

        $.ajax({
            method: "post",
            url: "ServletDeleteTournaments",
            data: {
                idTournament: id
            }
        }).done(function (ms) {
            if (ms === "Eliminado Correctamente") {
                swal("Excelente!", ms, "success");
            } else {
                swal("Error!", ms, "error");

            }
        });
    });

    $("#insertarEquipo").click(function () {
        $.ajax({
            method: "post",
            url: "ServletAddTeam",
            data: {
                name: $("#nombreEquipo").val(),
                idTournament: $("#labelCambiante").text()
            }
        }).done(function (ms) {
            if (ms === "Equipo Insertado") {
                swal("Excelente!", ms, "success");
            } else {
                swal("Error!", ms, "error");
            }
        });
    });

//    $(".elimiarEquipo").click(function(){
//        var id = $(this).val();
//        $.ajax({
//            method:"post",
//            url:"ServletDeleteTeam",
//            data:{
//                idTeam: id
//            }
//        }).done(function(ms){
//            if(ms ==="Equipo Eliminado"){
//                swal("Exelente!", ms, "success");
//            }else{
//               swal("Error!", ms, "error");    
//            }
//        });
//    });

    $(".elimiarEquipo").click(function () {
        var id = $(this).val();
        swal({title: "¿Estas seguro?",
            text: "¡Deseas eliminar este equipo!",
            type: "warning",
            showCancelButton: true,
            confirmButtonColor: "#DD6B55",
            confirmButtonText: "Eliminar",
            cancelButtonText: "Cancelar",
            closeOnConfirm: false,
            closeOnCancel: false},
                function (isConfirm) {
                    if (isConfirm) {
                        $.ajax({
                            method: "post",
                            url: "ServletDeleteTeam",
                            data: {
                                idTeam: id
                            }
                        });
                        swal("Excelente!", "Equipo Eliminado", "success");
                    } else {
                        swal("Cancelado", "Eliminar Equipo", "error");
                    }
                });



    });


    $(".insertPlayer").click(function () {
        var id = $(this).val();
        $.ajax({
            method: "post",
            url: "ServletConsultPlayer",
            data: {
                idGame: id
            }
        }).done(function (table) {
            $("#divDatosJugador").html(table);
            $(".tblDatosJugador").DataTable({
                "language": {
                    "url": "//cdn.datatables.net/plug-ins/9dcbecd42ad/i18n/Spanish.json"
                },
                dom: 'Bfrtip',
                buttons: [
                    {
                        extend: 'copyHtml5',
                        text: '<i class="fa fa-files-o"></i>',
                        titleAttr: 'Copiar'
                    },
                    {
                        extend: 'excelHtml5',
                        text: '<i class="fa fa-file-excel-o"></i>',
                        titleAttr: 'Exportar a Excel'
                    },
                    {
                        extend: 'pdfHtml5',
                        download: 'open',
                        text: '<i class="fa fa-file-pdf-o"></i>',
                        titleAttr: 'Generar PDF',
                        exportOptions: {
                            columns: [0, 1, 2, 3]
                        }
                    }
                ]

            });
        });
        $("#datosEquipo").hide();
        $("#divContenedorJugador").show();


        $("#btnAgregarJugador").click(function () {
            $("#divContenedorJugador").hide();
            $("#divFormJugador").show();

            $(".registrarJugador").click(function () {
                $.ajax({
                    method: "post",
                    url: "ServletAddPlayer",
                    data: {
                        name: $("#nombre").val(),
                        lastName: $("#apellido").val(),
                        documentType: $("#tipoDocumento").val(),
                        documentNumber: $("#numero_documento").val(),
                        birthday: $("#fecha_nacimiento").val,
                        address: $("#direccion").val(),
                        telephone: $("#telefono").val(),
                        email: $("#correo").val(),
                        numbershirt: $("#numero_camiseta").val(),
                        weight: $("#peso").val(),
                        height: $("#estatura").val(),
                        position: $("#posicion").val(),
                        idTeam: id
                    }
                }).done(function (m) {
                    if (m === "Jugador Insertado Correctamente") {
                        swal("Excelente!", m, "success");
                    } else {
                        swal("Error!", m, "error");
                    }
                });
            });
        });
    });

    $(".btnEliminarJugador").click(function () {
        var id = $(this).val();
        swal({title: "¿Estas seguro?",
            text: "¡Deseas eliminar este jugador!",
            type: "warning",
            showCancelButton: true,
            confirmButtonColor: "#DD6B55",
            confirmButtonText: "Eliminar",
            cancelButtonText: "Cancelar",
            closeOnConfirm: false,
            closeOnCancel: false},
                function (isConfirm) {
                    if (isConfirm) {
                        $.ajax({
                            method: "post",
                            url: "ServletDeletePlayer",
                            data: {
                                idPlayer: id
                            }
                        });
                        swal("Excelente!", "Jugador Eliminado", "success");
                    } else {
                        swal("Cancelado", "Eliminar Jugador", "error");
                    }
                });

    });

    $(".btnEliminarUsuario").click(function () {
        var id = $(this).val();
        $.ajax({
            method: "post",
            url: "ServletDeleteEmployee",
            data: {
                idEmployee: id
            }
        }).done(function (ms) {
            if (ms === "Se Elimino Correctamente") {
                swal("Excelente!", ms, "success");

            } else {
                swal("Error!", ms, "error");

            }
        });
    });

    $(".eliminarArbitro").click(function () {
        var id = $(this).val();
        //  alert("helloooooooooo :"+id); 
        $.ajax({
            method: "post",
            url: "ServletDeleteReferee",
            data: {
                idReferee: id
            }
        }).done(function (ms) {
            if (ms === "Arbitro Eliminado") {
                swal("Excelente!", ms, "success");

            } else {
                swal("Error!", ms, "error");

            }
        });
    });

    $(".btnEliminarImplementos").click(function () {
        var idimp = $(this).val();
        $.ajax({
            method: "post",
            url: "ServletDeleteImplements",
            data: {
                idImplements: idimp
            }
        }).done(function (msg) {
            swal("Excelente!", msg, "success");
        });

    });
});


function updateReferee(id) {
    var idA = eval($(id).attr("id"));
    for (var i = 0; i < idA.length; i++) {
        $("#nombreArbitro").val(idA[i].nom);
        $("#apellidoArbitro").val(idA[i].ape);
        $("#tipoDocArbitro").val(idA[i].tipoDoc);
        $("#numDocumentoArbitro").val(idA[i].numDoc);
        $("#posicionArbitro").val(idA[i].posic);
        $("#telefonoArbitro").val(idA[i].tel);
        $("#correoArbitro").val(idA[i].corr);
        $("#direccionArbitro").val(idA[i].direc);
        var idArbitro = (idA[i].id);
        $("#tabsArbitro").hide();
        $("#btnModificarArbitros").show();
        $("#btnGuardarArbitros").hide();
        $("#divFormArbitros").slideDown();
        $("#nombreArbitro").focus();
        $("#apellidoArbitro").focus();
        $("#tipoDocArbitro").focus();
        $("#numDocumentoArbitro").focus();
        $("#posicionArbitro").focus();
        $("#telefonoArbitro").focus();
        $("#correoArbitro").focus();
        $("#direccionArbitro").focus();

        $("#btnModificarArbitros").click(function () {
            $.ajax({
                method: "post",
                url: "ServletUpdateReferee",
                data: {
                    idArbitro: idArbitro,
                    nomArbitroModifcar: $("#nombreArbitro").val(),
                    apeArbitroModificar: $("#apellidoArbitro").val(),
                    tipoDocArbitroModificar: $("#tipoDocArbitro").val(),
                    numDocArbitroModificar: $("#numDocumentoArbitro").val(),
                    posicionArbitroModificar: $("#posicionArbitro").val(),
                    telArbitroModificar: $("#telefonoArbitro").val(),
                    correoArbitroModificar: $("#correoArbitro").val(),
                    direccionArbitroModificar: $("#direccionArbitro").val()
                }
            }).done(function (text) {
                if (text === "Datos modificados correctamente") {
                    swal("Excelente!", text, "success");
                } else {
                    swal("Error!", text, "error");

                }
            });
        });

    }
}

function updateImplements(id) {
    var idI = eval($(id).attr("id"));

    for (var i = 0; i < idI.length; i++) {
        $("#codigoI").val(idI[i].cod);
        $("#nombreI").val(idI[i].nom);
        $("#marcaI").val(idI[i].mar);
        $("#descripcionI").val(idI[i].desc);
        $("#cantidadI").val(idI[i].cant);
        $("#estadoI").val(idI[i].est);
        var d = (idI[i].id);
        $("#divInventario").hide();
        $("#btnModificarImplemento").show();
        $("#btnGuardarImplementos").hide();
        $("#formInventario").show();
        $("#codigoI").focus();
        $("#nombreI").focus();
        $("#marcaI").focus();
        $("#descripcionI").focus();
        $("#cantidadI").focus();
        $("#estadoI").focus();

        $(".btnModificarImplemento").click(function () {

            $.ajax({
                method: "post",
                url: "ServletUpdateImplements",
                data: {
                    id: d,
                    code: $("#codigoI").val(),
                    name: $("#nombreI").val(),
                    brand: $("#marcaI").val(),
                    description: $("#descripcionI").val(),
                    quantity: $("#cantidadI").val(),
                    state: $("#estadoI").val()
                }
            }).done(function (m) {
                if (m === "modificado correctamente") {
                    swal("Excelente!", m, "success");
                } else {
                    swal("Error!", m, "error");
                }
            });
            $("#formInventario").hide();
            $("#divInventario").show();
        });
    }

}


function updateEmployee(id) {
    var idI = eval($(id).attr("id"));
    for (var i = 0; i < idI.length; i++) {
        $("#nombreUsuario").val(idI[i].nom);
        $("#apellidoUsuario").val(idI[i].ape);
        $("#tipoDocUsuario").val(idI[i].tipoDoc);
        $("#numDocumentoUsuario").val(idI[i].numdocum);
        $("#tipoUsuario").val(idI[i].numdocum);
        $("#telefonoUsuario").val(idI[i].tel);
        $("#correoUsuario").val(idI[i].corr);
        $("#direccionUsuario").val(idI[i].direc);
        var usu = (idI[i].id);
        $("#tabsEmpleado").hide();
        $("#divDatos").slideUp();
        $(".btnModificarPersonas").show();
        $("#btnGuardarPersonas").hide();
        $("#formPersonal").show();
        $("#nombreUsuario").focus();
        $("#apellidoUsuario").focus();
        $("#tipoDocUsuario").focus();
        $("#numDocumentoUsuario").focus();
        $("#tipoUsuario").focus();
        $("#telefonoUsuario").focus();
        $("#correoUsuario").focus();
        $("#direccionUsuario").focus();

        $(".btnModificarPersonas").click(function () {
            $.ajax({
                method: "post",
                url: "ServletUpdateEmployee",
                data: {
                    id: usu,
                    name: $("#nombreUsuario").val(),
                    lastName: $("#apellidoUsuario").val(),
                    documentType: $("#tipoDocUsuario").val(),
                    documentNumber: $("#numDocumentoUsuario").val(),
                    telephone: $("#telefonoUsuario").val(),
                    email: $("#correoUsuario").val(),
                    address: $("#direccionUsuario").val(),
                    userType: $("#tipoUsuario").val()
                }
            }).done(function (resp) {
                if (resp === "datos modificados") {
                    swal("Excelente!", resp, "success");
                } else {
                    swal("Error!", resp, "error");
                }
            });
        });
    }
}

function updatePlayer(id) {
    var idP = eval($(id).attr("id"));
    for (var i = 0; i < idP.length; i++) {
        $("#nombre").val(idP[i].name);
        $("#apellido").val(idP[i].ape);
        $("#tipoDocumento").val(idP[i].tipodoc);
        $("#numero_documento").val(idP[i].doc);
        $("#fecha_nacimiento").val(idP[i].nac);
        $("#direccion").val(idP[i].dir);
        $("#telefono").val(idP[i].tel);
        $("#correo").val(idP[i].email);
        $("#numero_camiseta").val(idP[i].numc);
        $("#peso").val(idP[i].peso);
        $("#estatura").val(idP[i].est);
        $("#posicion").val(idP[i].pos);
        var player = (idP[i].id);
        $("#divContenedorJugador").slideUp();
        $("#divFormJugador").slideDown();
        $("#nombre").focus();
        $("#apellido").focus();
        $("#tipoDocumento").focus();
        $("#numero_documento").focus();
        $("#fecha_nacimiento").focus();
        $("#direccion").focus();
        $("#telefono").focus();
        $("#correo").focus();
        $("#numero_camiseta").focus();
        $("#peso").focus();
        $("#estatura").focus();
        $("#posicion").focus();

        $("#btnModificarJugador").click(function () {
            $.ajax({
                method: "post",
                url: "ServletUpdatePlayer",
                data: {
                    name: $("#nombre").val(),
                    lastName: $("#apellido").val(),
                    documentType: $("#tipoDocumento").val(),
                    documentNumber: $("#numero_documento").val(),
                    birthday: $("#fecha_nacimiento").val,
                    address: $("#direccion").val(),
                    telephone: $("#telefono").val(),
                    email: $("#correo").val(),
                    numbershirt: $("#numero_camiseta").val(),
                    weight: $("#peso").val(),
                    height: $("#estatura").val(),
                    position: $("#posicion").val(),
                    idPlayer: player
                }
            }).done(function (respuesta) {
                if (respuesta === "Datos modificados") {
                    swal("Excelente!", respuesta, "success");
                } else {
                    swal("Error!", respuesta, "error");
                }
            });
        });


    }
}

function updateTorneos(id) {
    var idT = eval($(id).attr("id"));
    for (var i = 0; i < idT.length; i++) {
        $("#nombreT").val(idT[i].name);
        $("#fechaIni").val(idT[i].fechaIni);
        $("#fechaFin").val(idT[i].fechaFin);
        $("#descripcion").val(idT[i].desc);
        var idtorneo = (idT[i].id);
        $("#btnModTorneo").show();
        $("#btnCrearTorneo").hide();
        $("#divFormTorneos").show();
        $("#nombreT").focus(),
                $("#fechaIni").focus();
        $("#fechaFin").focus();
        $("#descripcion").focus();

        $(".btnModTorneo").click(function () {
            $.ajax({
                method: "post",
                url: "ServletUpdateTournament",
                data: {
                    id: idtorneo,
                    name: $("#nombreT").val(),
                    fechaini: $("#fechaIni").val(),
                    fechafin: $("#fechaFin").val(),
                    descripcion: $("#descripcion").val()

                }
            }).done(function (resp) {
                if (resp === "Datos modificados") {
                    swal("Excelente!", resp, "success");
                } else {
                    swal("Error!", resp, "error");
                }
            });
        });
    }
}

function updateTeam(id) {
    var idE = eval($(id).attr("id"));
    for (var i = 0; i < idE.length; i++) {
        $("#nombreEquipo").val(idE[i].name);
        var idequipo = (idE[i].id);
        $("#datosEquipo").hide();
        $("#modal1").show();
    }
}


function deletePlayer() {
    $(".btnEliminarJugador").click(function () {
        var id = $(this).val();
        swal({title: "¿Estas seguro?",
            text: "¡Deseas eliminar este jugador!",
            type: "warning",
            showCancelButton: true,
            confirmButtonColor: "#DD6B55",
            confirmButtonText: "Eliminar",
            cancelButtonText: "Cancelar",
            closeOnConfirm: false,
            closeOnCancel: false},
                function (isConfirm) {
                    if (isConfirm) {
                        $.ajax({
                            method: "post",
                            url: "ServletDeletePlayer",
                            data: {
                                idPlayer: id
                            }
                        });
                        swal("Excelente!", "Jugador Eliminado", "success");
                    } else {
                        swal("Cancelado", "Eliminar Jugador", "error");
                    }
                });

    });

}

function modificarEquipo(id) {
    $(".modificarEquipo").click(function () {
        var idE = eval($(id).attr("id"));
        for (var i = 0; i < idE.length; i++) {
            $("#nombreEquipoModificar").val(idE[i].cod);
            var idequipo = (idE[i].id);
            $("#divModificarEquipo").show();
            $("#nombreEquipoModificar").focus();
            
            $(".btnModificarEquipo").click(function(){
               $.ajax({
                   method:"post",
                   url:"ServletUpdateTeam",
                   data:{
                       id:idequipo,
                       name:$("#nombreEquipoModificar").val()
                   }
               }).done(function(ms){
                   if(ms === "Datos modificados"){
                                               swal("Excelente!", ms, "success");

                   }else{
                                               swal("Error", ms, "error");

                   }
               });
            });

        }


    });
}