/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


function bagAddOne(IDProduct){  
    location.href="add?idProduct="+IDProduct;
}
function bagRemoveOne(IDProduct){  
    location.href="remove?idProduct="+IDProduct;
}
function checkout(){
    location.href="checkout";
}