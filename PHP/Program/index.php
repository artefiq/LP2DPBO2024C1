<?php
// Memanggil class Shirt yang diperlukan
require_once 'Shirt.php';

// Membuat array dari objek Shirt
$listShirt = [
    new Shirt("1A", "Kaos", "Gucci", "2501837", "M", "Cotton", "L", "Blue", "Lengan Pendek"),
    new Shirt("1B", "Kemeja", "LV", "38476210", "L", "Linen", "Female", "Pink", "Short"),
    new Shirt("2A", "T-Shirt", "YSL", "59184756", "XL", "Cotton Combed","P", "Hijau Botol", "Long")
];
?>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <style>
        table {
            width: 100%;
            margin-top: 20px;
        }

        th, td {
            border: 1px solid #ddd;
            padding: 8px;
            text-align: left;
        }

        th {
            background-color: #00ffff;
            text-align: center;
        }

        img {
            max-width: 100px;
            max-height: 100px;
        }
    </style>
    <title>List Shirt</title>
</head>

<body>

    <h2>List Shirt</h2>
    <br>
    <p>Create & Read</p>
    <!-- Membuat tabel untuk menampilkan daftar baju -->
    <table>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Brand</th>
            <th>Size</th>
            <th>Material</th>
            <th>Color</th>
            <th>Sleevetype</th>
            <th>Price</th>
            <th>Image</th>
        </tr>

        <?php foreach ($listShirt as $shirt) { ?>
            <!-- Menampilkan data baju pada baris tabel -->

            <tr>
                <td><?= $shirt->getId() ?></td>
                <td><?= $shirt->getName() ?></td>
                <td><?= $shirt->getbrand() ?></td>
                <td><?= $shirt->getsize() ?></td>
                <td><?= $shirt->getmaterial() ?></td>
                <td><?= $shirt->getcolor() ?></td>
                <td><?= $shirt->getsleeveType() ?></td>
                <td><?= $shirt->getprice() ?></td>
                <td><img src='<?= "data:image/jpeg;base64,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"?>' alt='Foto'></td>
            </tr>
        <?php } ?>
    </table>

    <br>
    <p>Update</p>
    <table>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Brand</th>
            <th>Size</th>
            <th>Material</th>
            <th>Color</th>
            <th>Sleevetype</th>
            <th>Price</th>
            <th>Image</th>
        </tr>

        <?php foreach ($listShirt as $shirt) { 
                // Mengubah nama shirt dengan ID "1B" menjadi "Oblong"
                if ($shirt->getId() == "1B") $shirt->setName("Oblong"); ?>
            <tr>
                <td><?= $shirt->getId() ?></td>
                <td><?= $shirt->getName() ?></td>
                <td><?= $shirt->getbrand() ?></td>
                <td><?= $shirt->getsize() ?></td>
                <td><?= $shirt->getmaterial() ?></td>
                <td><?= $shirt->getcolor() ?></td>
                <td><?= $shirt->getsleeveType() ?></td>
                <td><?= $shirt->getprice() ?></td>
                <td><img src='<?= "data:image/jpeg;base64,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"?>' alt='Foto'></td>
            </tr>
        <?php } ?>

    </table>

    <br>
    <p>Delete</p>
    <table>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Brand</th>
            <th>Size</th>
            <th>Material</th>
            <th>Color</th>
            <th>Sleevetype</th>
            <th>Price</th>
            <th>Image</th>
        </tr>

        <?php foreach ($listShirt as $shirt) { 
                // Menghapus shirt dengan ID "2A" dari array
                if ($shirt->getId() == "2A") {
                    $key = array_search($shirt, $listShirt);
                    if ($key !== false) {
                        array_splice($listShirt, $key, 1);
                    }
                    continue;
                }?>
            <tr>
                <td><?= $shirt->getId() ?></td>
                <td><?= $shirt->getName() ?></td>
                <td><?= $shirt->getbrand() ?></td>
                <td><?= $shirt->getsize() ?></td>
                <td><?= $shirt->getmaterial() ?></td>
                <td><?= $shirt->getcolor() ?></td>
                <td><?= $shirt->getsleeveType() ?></td>
                <td><?= $shirt->getprice() ?></td>
                <td><img src='<?= "data:image/jpeg;base64,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"?>' alt='Foto'></td>
            </tr>
        <?php } ?>

    </table>

</body>

</html>
