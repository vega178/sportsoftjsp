/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready(function () {
    $("#formPersonal").hide();
    $("#divFormArbitros").hide();
    $("#divFormTorneos").hide();
    $("#divContenedorJugador").hide();
    $("#divFormJugador").hide();
    $("#divDatos").hide();
    $("#divDatosArbitro").hide();
    $("#formInventario").hide();
    // $("#datosEquipo").hide();
    $("#divRegistro").hide();
    $("#labelCambiante").hide();
    $("#tableposicion").hide();
    $("#fechasCompeticion").hide();
    $("#divPartidos").hide();
    $("#divModificarEquipo").hide();
      $("#tituloArbitro").hide();
});

function formPerson() {
    $("#formPersonal").slideDown();
    $("#card").slideUp();
    $("#divFormArbitros").hide();
    $(".btnModificarPersonas").hide();

}

function formReferee() {
    $("#formPersonal").hide();
    $("#card").slideUp();
    $("#divFormArbitros").slideDown();
    $("#btnModificarArbitros").hide();
}

function cancel() {
    $("#formPersonal").hide();
    $("#divFormArbitros").hide();
    $("#card").slideDown();
    $("#divFormTorneos").hide();
    $("#divDatosTorneo").slideDown();


}

function addTournaments() {
    $("#divFormTorneos").slideDown();
    $("#divDatosTorneo").slideUp();
    $("#btnModTorneo").hide();
}

function tableEmployee() {
    $("#card").hide();
    $("#divDatos").slideDown();
    $("#divDatosArbitro").hide();
    $("#divFormArbitros").hide();
    $("#formPersonal").hide();
    $("#tituloArbitro").hide();
    $("#tituloPersonal").show();
}

function tableReferee() {
    $("#card").hide();
    $("#divDatos").hide();
    $("#divDatosArbitro").slideDown();
    $("#divFormArbitros").hide();
    $("#formPersonal").hide();
    $("#tituloPersonal").hide();
    $("#tituloArbitro").show();
}

function addImplements() {
    $("#formInventario").slideDown();
    $("#divInventario").hide();
    $("#btnModificarImplemento").hide();
}

function registro() {
    $("#divRegistro").slideToggle();
    $("#divLogin").slideUp();
}

function login() {
    $("#divRegistro").slideUp();
    $("#divLogin").slideDown();
}

function tablaPosiion() {
    $("#tableposicion").slideDown();
    $("#divContenedorJugador").hide();
    $("#divFormJugador").hide();
    $("#datosEquipo").slideUp();
    $("#fechasCompeticion").hide();
    $("#divPartidos").hide();

}

function calendario() {
    $("#fechasCompeticion").show();
    $("#tableposicion").slideUp();
    $("#divContenedorJugador").hide();
    $("#divFormJugador").hide();
    $("#datosEquipo").slideUp();
    $("#divPartidos").hide();

}

function partidos() {
    $("#divPartidos").show();
    $("#tableposicion").slideUp();
    $("#divContenedorJugador").hide();
    $("#divFormJugador").hide();
    $("#datosEquipo").slideUp();
    $("#fechasCompeticion").hide();





}