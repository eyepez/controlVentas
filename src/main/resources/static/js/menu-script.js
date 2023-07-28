// Función para ocultar/mostrar los submenús
function toggleSubmenu(event) {
    const submenu = event.currentTarget.querySelector('ul');
    submenu.classList.toggle('collapsed');
}

// Añadir evento a los ítems del menú que tengan submenús
const menuItemsWithSubmenu = document.querySelectorAll('#sidebar .has-submenu');
menuItemsWithSubmenu.forEach(item => {
    item.addEventListener('click', toggleSubmenu);
});

// Función para ocultar/mostrar la barra lateral
function toggleSidebar() {
    const sidebar = document.getElementById('sidebar');
    sidebar.classList.toggle('collapsed');
}

// Función para ocultar/mostrar la barra lateral y cambiar el ícono
// function toggleSidebar() {
//     const sidebar = document.getElementById('sidebar');
//     sidebar.classList.toggle('collapsed');
//
//     const compressIcon = document.getElementById('compress-icon');
//     compressIcon.classList.toggle('compressed');
// }

// Función para limpiar el formulario
function clearForm() {
    const form = document.querySelector('.client-form');
    form.reset();
}
