# Trabajo Práctico Integrador Selenium
### Descripción del TPI:
Este proyecto tiene como objetivo automatizar la compra de una prenda en el sitio web de Magento, utilizando Selenium WebDriver en combinación con el patrón de diseño Page Object y el Principio de Responsabilidad Única.

### Caso de Prueba - Compra de Prenda en Magento

#### Descripción
Este caso de prueba automatiza el proceso de compra de una prenda en el sitio web de Magento.

#### Pasos:
1. Abrir el navegador e ir al sitio web de Magento: [Magento Site](https://magento.softwaretestingboard.com/)
2. Seleccionar la prenda "Radiant Tee".
3. Configurar las opciones de la prenda:
    - Tamaño: L
    - Color: Azul
    - Cantidad: 2
4. Hacer clic en "Add to Cart".
5. Hacer clic en el enlace "shopping cart".
6. Hacer clic en "Proceed to Checkout".
7. Completar el formulario de dirección de envío con los datos deseados.
8. Seleccionar la primera opción en los Métodos de Envío.
9. Hacer clic en "Next".
10. Hacer clic en "Place Order".

#### Validaciones:
- El título es igual a "Thank you for purchase!"
- El botón “Continue Shopping” está habilitado.
- El botón “Create an Account” está visible.
- El número de la orden (Your order # is:) es un número (en la captura de ejemplo es el 000026889). Pista: mediante el método `split()` de la clase `String`, se podrá separar todo el texto en palabras.

### Requisitos
- Java
- Selenium WebDriver
- TestNG (u otro framework de pruebas)
- Uso del patrón Page Object junto al Principio de Responsabilidad Única
- Un navegador web compatible (Chrome, Firefox, etc.)
- Herramienta de construcción de proyectos como Maven o Gradle
