<?php
$m->MongoClient();
$db = $m->selectDB('TYITDB1');
$collection = $db->selectCollection('TYITCOL');
// delete data
$collection->remove(array("name" => "Deepak"));
echo "Data deleted successfully";
?>