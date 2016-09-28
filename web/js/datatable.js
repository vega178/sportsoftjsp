/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function(){
    $('#datosTorneo').DataTable( {
        "language": {
     "url": "//cdn.datatables.net/plug-ins/9dcbecd42ad/i18n/Spanish.json"
        },
         dom: 'Bfrtip',
        buttons: [
            {
                extend:    'copyHtml5',
                text:      '<i class="fa fa-files-o"></i>',
                titleAttr: 'Copiar'
            },
            {
                extend:    'excelHtml5',
                text:      '<i class="fa fa-file-excel-o"></i>',
                titleAttr: 'Exportar a Excel'
            },
            
            {
                extend:    'pdfHtml5',
                download: 'open',
                text:      '<i class="fa fa-file-pdf-o"></i>',
                titleAttr: 'Generar PDF',
                 exportOptions:{
                    columns:[0,1,2,3]
                }
            }
        ]
    });
    
    $('#datosJugador').DataTable( {
        "language": {
     "url": "//cdn.datatables.net/plug-ins/9dcbecd42ad/i18n/Spanish.json"
        }
    });
    
    $('#datosEmpleado').DataTable( {
        "language": {
     "url": "//cdn.datatables.net/plug-ins/9dcbecd42ad/i18n/Spanish.json"
        },
        dom: 'Bfrtip',
        buttons: [
            {
                extend:    'copyHtml5',
                text:      '<i class="fa fa-files-o"></i>',
                titleAttr: 'Copiar'
            },
            {
                extend:    'excelHtml5',
                text:      '<i class="fa fa-file-excel-o"></i>',
                titleAttr: 'Exportar a Excel'
            },
           
            {
                extend:    'pdfHtml5',
                download: 'open',
                text:      '<i class="fa fa-file-pdf-o"></i>',
                titleAttr: 'Generar PDF',
                 exportOptions:{
                    columns:[0,1,2,3,4,5,6]
                }
            }
        ]
        
    });
    
     $('#datosArbitro').DataTable( {
        "language": {
     "url": "//cdn.datatables.net/plug-ins/9dcbecd42ad/i18n/Spanish.json"
        },
        dom: 'Bfrtip',
        buttons: [
            {
                extend:    'copyHtml5',
                text:      '<i class="fa fa-files-o"></i>',
                titleAttr: 'Copiar'
            },
            {
                extend:    'excelHtml5',
                text:      '<i class="fa fa-file-excel-o"></i>',
                titleAttr: 'Exportar a Excel'
            },
           
            {
                extend:    'pdfHtml5',
                 download: 'open',
                text:      '<i class="fa fa-file-pdf-o"></i>',
                titleAttr: 'Generar PDF',
                exportOptions:{
                    columns:[0,1,2,3,4,5,6,7]
                }
                
            }
        ]
    });
   
    $("#tblDatosImplementos").DataTable({
        "language": {
     "url": "//cdn.datatables.net/plug-ins/9dcbecd42ad/i18n/Spanish.json"
        },
         dom: 'Bfrtip',
        buttons: [
            {
                extend:    'copyHtml5',
                text:      '<i class="fa fa-files-o"></i>',
                titleAttr: 'Copiar'
            },
            {
                extend:    'excelHtml5',
                text:      '<i class="fa fa-file-excel-o"></i>',
                titleAttr: 'Exportar a Excel'
            },
           
            {
                extend:    'pdfHtml5',
                download: 'open',
                text:      '<i class="fa fa-file-pdf-o"></i>',
                titleAttr: 'Generar PDF',
                 exportOptions:{
                    columns:[0,1,2,3,4,5]
                }
            }
        ]
    });
    
    
     $("#tblPosicion").DataTable({
        "language": {
     "url": "//cdn.datatables.net/plug-ins/9dcbecd42ad/i18n/Spanish.json"
        },
         dom: 'Bfrtip',
        buttons: [
            {
                extend:    'copyHtml5',
                text:      '<i class="fa fa-files-o"></i>',
                titleAttr: 'Copiar'
            },
            {
                extend:    'excelHtml5',
                text:      '<i class="fa fa-file-excel-o"></i>',
                titleAttr: 'Exportar a Excel'
            },
           
            {
                extend:    'pdfHtml5',
                download: 'open',
                text:      '<i class="fa fa-file-pdf-o"></i>',
                titleAttr: 'Generar PDF',
                 exportOptions:{
                    columns:[0,1,2,3,4,5,6,7]
                }
            }
        ]
    });
    
});

function tablePlayer(){
    
}