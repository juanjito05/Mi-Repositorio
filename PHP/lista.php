
<?php
$DB_HOST = 'localhost';
$DB_NAME = 'elamigos'; // cambia por el nombre de tu BD
$DB_USER = 'root';      // cambia por tu usuario
$DB_PASS = '';     // cambia por tu contraseña

try {
    $dsn = "mysql:host=$DB_HOST;dbname=$DB_NAME;charset=utf8mb4";
    $options = [
        PDO::ATTR_ERRMODE => PDO::ERRMODE_EXCEPTION,
        PDO::ATTR_DEFAULT_FETCH_MODE => PDO::FETCH_ASSOC,
    ];
    $pdo = new PDO($dsn, $DB_USER, $DB_PASS, $options);
} catch (PDOException $e) {
    // En producción no mostrar errores detallados
    die('Error de conexión: ' . $e->getMessage());
}
?>