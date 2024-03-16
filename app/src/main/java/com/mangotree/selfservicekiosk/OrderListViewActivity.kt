package com.mangotree.selfservicekiosk

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mangotree.selfservicekiosk.databinding.ActivityOrderListViewBinding

class OrderListViewActivity : AppCompatActivity() {

    private lateinit var binding: ActivityOrderListViewBinding

    companion object {
        var totalAmount: Double = 0.0
        var orderList = mutableListOf<String>()
    }

    var sisilogName = "Sisilog"
    var steamedFriedRiceName = "Steamed Fried Rice"
    var porkchopName = "Porkchop"
    var burgerSteakName = "Burger Steak"
    var chickenStripsName = "Chicken Strips"
    var siomaiName = "Siomai"
    var lumpiaName = "Lumpia"
    var bbqRiceName = "Bbq Rice"
    var tocinoWithEggName = "Tocino With Egg"
    var tocinoWithoutEggName = "Tocino Without Egg"
    var chickenNuggetsName = "Chicken Nuggets"
    var javaRiceName = "Java Rice"
    var crispyBurgerName = "Crispy Burger"
    var c2SmallName = "C2 Small"
    var c2MediumName = "C2 Medium"
    var gulamanSmallName = "Gulaman Small"
    var gulamanMediumName = "Gulaman Medium"
    var coffeeJellySmallName = "Coffee Jelly Small"
    var coffeeJellyMediumName = "Coffee Jelly Medium"
    var mangoTapiocaSmallName = "Mango Tapioca Small"
    var mangoTapiocaMediumName = "Mango Tapioca Medium"
    var natureSpringSmallName = "Nature Spring Small"
    var natureSpringMediumName = "Nature Spring Medium"
    var icedCoffeeName = "Iced Coffee"
    var icedTeaName = "Iced Tea"
    var vitamilkOriginalName = "Vitamilk Original"
    var vitamilkChocolateName = "Vitamilk Chocolate"
    var vitamilkStrawberryName= "Vitamilk Strawberry"
    var luncheonMeatName = "Luncheon Meat"
    var nuggetsName = "Nuggets"
    var kwekKwekName = "Kwek-Kwek"
    var friesSmallName = "Fries Small"
    var friesMediumName = "Fries Medium"
    var friesLargeName = "Fries Large"
    var longganisaName = "Longganisa"

    ////////////////////////////////////////////////////////////////////////////////////////////////

    //RICE MEALS COUNT
    var sisilogCount = 0
    var steamedFriedRiceCount = 0
    var porkchopCount = 0
    var burgerSteakCount = 0
    var chickenStripsCount = 0
    var siomaiRiceCount = 0
    var lumpiaCount = 0
    var bbqRiceCount = 0
    var tocinoWithEggCount = 0
    var tocinoWithoutEggCount = 0
    var chickenNuggetsCount = 0
    var javaRiceCount = 0
    var crispyBurgerCount = 0

    //DRINKS COUNT
    var c2SmallCount = 0
    var c2MediumCount = 0
    var gulamanSmallCount = 0
    var gulamanMediumCount = 0
    var coffeeJellySmallCount = 0
    var coffeeJellyMediumCount = 0
    var mangoTapiocaSmallCount = 0
    var mangoTapiocaMediumCount = 0
    var natureSpringSmallCount = 0
    var natureSpringMediumCount = 0
    var icedCoffeeCount = 0
    var icedTeaCount = 0
    var vitamilkOriginalCount = 0
    var vitamilkChocolateCount = 0
    var vitamilkStrawberryCount = 0

    //SNACKS COUNT
    var luncheonMeatCount = 0
    var nuggetsCount = 0
    var kwekKwekCount= 0
    var friesSmallCount = 0
    var friesMediumCount = 0
    var friesLargeCount = 0
    var longganisaCount = 0

    ///////////////////////////////////////////////////////////////////////////////////////////////

    //RICE MEALS PRICES
    val sisilogPrice = 60
    val steamedFriedRicePrice = 55
    val porkchopPrice = 60
    val burgerSteakPrice = 60
    val chickenStripsPrice = 60
    val siomaiRicePrice = 45
    val lumpiaPrice = 45
    val bbqRicePrice = 55
    val tocinoWithEggPrice = 65
    val tocinoWithoutEggPrice = 55
    val chickenNuggetsPrice = 45
    val javaRicePrice = 50
    val crispyBurgerPrice = 45

    //DRINKS PRICES
    val c2SmallPrice = 20
    val c2MediumPrice = 35
    val gulamanSmallPrice = 25
    val gulamanMediumPrice = 35
    val coffeeJellySmallPrice = 25
    val coffeeJellyMediumPrice = 35
    val mangoTapiocaSmallPrice = 25
    val mangoTapiocaMediumPrice = 35
    val natureSpringSmallPrice = 20
    val natureSpringMediumPrice = 25
    val icedCoffeePrice = 25
    val icedTeaPrice = 25
    val vitamilkOriginalPrice = 35
    val vitamilkChocolatePrice = 35
    val vitamilkStrawberryPrice = 40

    //SNACKS PRICES
    val luncheonMeatPrice = 20
    val nuggetsPrice = 10
    val kwekKwekPrice = 25
    val friesSmallPrice = 35
    val friesMediumPrice = 45
    val friesLargePrice = 60
    val longganisaPrice = 15

    /////////////////////////////////////////////////////////////////////////////////////////////

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOrderListViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //PLUS
        binding.sisilogPlusButton.setOnClickListener {
            sisilogCount++
            binding.sisilogCountTextView.text = "$sisilogCount"

            addDisplayTotalAmount(sisilogPrice.toDouble())
        }

        binding.steamedRicePlusButton.setOnClickListener {
            steamedFriedRiceCount++
            binding.steamedRiceCountTextView.text = "$steamedFriedRiceCount"

            addDisplayTotalAmount(steamedFriedRicePrice.toDouble())
        }

        binding.porkchopPlusButton.setOnClickListener {
            porkchopCount++
            binding.porkchopCountTextView.text = "$porkchopCount"

            addDisplayTotalAmount(porkchopPrice.toDouble())
        }

        binding.burgerstakePlusButton.setOnClickListener {
            burgerSteakCount++
            binding.burgerstakeCountTextView.text = "$burgerSteakCount"

            addDisplayTotalAmount(burgerSteakPrice.toDouble())
        }

        binding.siomaiRicePlusButton.setOnClickListener {
            siomaiRiceCount++
            binding.siomaiRiceCountTextView.text = "$siomaiRiceCount"

            addDisplayTotalAmount(siomaiRicePrice.toDouble())
        }

        binding.chickenStripsPlusButton.setOnClickListener {
            chickenStripsCount++
            binding.chickenStripsCountTextView.text = "$chickenStripsCount"
        }

        binding.lumpiaPlusButton.setOnClickListener {
            lumpiaCount++
            binding.lumpiaCountTextView.text = "$lumpiaCount"

            addDisplayTotalAmount(lumpiaPrice.toDouble())
        }

        binding.bbqRicePlusButton.setOnClickListener {
            bbqRiceCount++
            binding.bbqRiceCountTextView.text = "$bbqRiceCount"

            addDisplayTotalAmount(bbqRicePrice.toDouble())
        }

        binding.tocinoWithEggPlusButton.setOnClickListener {
            tocinoWithEggCount++
            binding.tocinoWithEggCountTextView.text = "$tocinoWithEggCount"

            addDisplayTotalAmount(tocinoWithEggPrice.toDouble())
        }

        binding.tocinoWithoutEggPlusButton.setOnClickListener {
            tocinoWithoutEggCount++
            binding.tocinoWithoutEggCountTextView.text = "$tocinoWithoutEggCount"

            addDisplayTotalAmount(tocinoWithoutEggPrice.toDouble())
        }

        binding.chickenNuggetsPlusButton.setOnClickListener {
            chickenNuggetsCount++
            binding.chickenNuggetsCountTextView.text = "$chickenNuggetsCount"

            addDisplayTotalAmount(chickenNuggetsPrice.toDouble())
        }

        binding.javaRicePlusButton.setOnClickListener {
            javaRiceCount++
            binding.javaRiceCountTextView.text = "$javaRiceCount"

            addDisplayTotalAmount(javaRicePrice.toDouble())
        }

        binding.crispyBurgerPlusButton.setOnClickListener {
            crispyBurgerCount++
            binding.crispyBurgerCountTextView.text = "$crispyBurgerCount"

            addDisplayTotalAmount(crispyBurgerPrice.toDouble())
        }

        //DRINKS

        binding.c2SmallPlusButton.setOnClickListener {
            c2SmallCount++
            binding.c2SmallCountTextView.text = "$c2SmallCount"

            addDisplayTotalAmount(c2SmallPrice.toDouble())
        }

        binding.c2MediumPlusButton.setOnClickListener {
            c2MediumCount++
            binding.c2MediumCountTextView.text = "$c2MediumCount"

            addDisplayTotalAmount(c2MediumPrice.toDouble())
        }

        binding.gulamanPlusButton.setOnClickListener {
            gulamanSmallCount++
            binding.gulamanCountTextView.text = "$gulamanSmallCount"

            addDisplayTotalAmount(gulamanSmallPrice.toDouble())
        }

        binding.gulamanMediumPlusButton.setOnClickListener {
            gulamanMediumCount++
            binding.gulamanMediumCountTextView.text = "$gulamanMediumCount"

            addDisplayTotalAmount(gulamanMediumPrice.toDouble())
        }

        binding.coffeeJellySmallPlusButton.setOnClickListener {
            coffeeJellySmallCount++
            binding.coffeeJellySmallCountTextView.text = "$coffeeJellySmallCount"

            addDisplayTotalAmount(coffeeJellySmallPrice.toDouble())
        }

        binding.coffeeJellyMediumPlusButton.setOnClickListener {
            coffeeJellyMediumCount++
            binding.coffeeJellyMediumCountTextView.text = "$coffeeJellyMediumCount"

            addDisplayTotalAmount(coffeeJellyMediumPrice.toDouble())
        }

        binding.mangoTapiocaSmallPlusButton.setOnClickListener {
            mangoTapiocaSmallCount++
            binding.mangoTapiocaSmallCountTextView.text = "$mangoTapiocaSmallCount"

            addDisplayTotalAmount(mangoTapiocaSmallPrice.toDouble())
        }

        binding.mangoTapiocaMediumPlusButton.setOnClickListener {
            mangoTapiocaMediumCount++
            binding.mangoTapiocaMediumCountTextView.text = "$mangoTapiocaMediumCount"

            addDisplayTotalAmount(mangoTapiocaMediumPrice.toDouble())
        }

        binding.natureSprintSmallPlusButton.setOnClickListener {
            natureSpringSmallCount++
            binding.natureSprintSmallCountTextView.text = "$natureSpringSmallCount"

            addDisplayTotalAmount(natureSpringSmallPrice.toDouble())
        }

        binding.natureSprintMediumPlusButton.setOnClickListener {
            natureSpringMediumCount++
            binding.natureSprintMediumCountTextView.text = "$natureSpringMediumCount"

            addDisplayTotalAmount(natureSpringMediumPrice.toDouble())
        }

        binding.iceCoffeePlusButton.setOnClickListener {
            icedCoffeeCount++
            binding.iceCoffeeCountTextView.text = "$icedCoffeeCount"

            addDisplayTotalAmount(icedCoffeePrice.toDouble())
        }

        binding.icedTeaSmallPlusButton.setOnClickListener {
            icedTeaCount++
            binding.icedTeaSmallCountTextView.text = "$icedTeaCount"

            addDisplayTotalAmount(icedTeaPrice.toDouble())
        }

        binding.vitamilkOriginalPlusButton.setOnClickListener {
            vitamilkOriginalCount++
            binding.vitamilkOriginalCountTextView.text = "$vitamilkOriginalCount"

            addDisplayTotalAmount(vitamilkOriginalPrice.toDouble())
        }

        binding.vitamilkChocolatePlusButton.setOnClickListener {
            vitamilkChocolateCount++
            binding.vitamilkChocolateCountTextView.text = "$vitamilkChocolateCount"

            addDisplayTotalAmount(vitamilkChocolatePrice.toDouble())
        }

        binding.vitamilkStrawberryPlusButton.setOnClickListener {
            vitamilkStrawberryCount++
            binding.vitamilkStrawberryCountTextView.text = "$vitamilkStrawberryCount"

            addDisplayTotalAmount(vitamilkStrawberryPrice.toDouble())
        }

        //SNACKS

        binding.luncheonMeatPlusButton.setOnClickListener {
            luncheonMeatCount++
            binding.luncheonMeatCountTextView.text = "$luncheonMeatCount"

            addDisplayTotalAmount(luncheonMeatPrice.toDouble())
        }

        binding.nuggetsPlusButton.setOnClickListener {
            nuggetsCount++
            binding.nuggetsCountTextView.text = "$nuggetsCount"

            addDisplayTotalAmount(nuggetsPrice.toDouble())
        }

        binding.kwekKwekPlusButton.setOnClickListener {
            kwekKwekCount++
            binding.kwekKwekCountTextView.text = "$kwekKwekCount"

            addDisplayTotalAmount(kwekKwekPrice.toDouble())
        }

        binding.friesSmallPlusButton.setOnClickListener {
            friesSmallCount++
            binding.friesSmallCountTextView.text = "$friesSmallCount"

            addDisplayTotalAmount(friesSmallPrice.toDouble())
        }

        binding.friesMediumPlusButton.setOnClickListener {
            friesMediumCount++
            binding.friesMediumCountTextView.text = "$friesMediumCount"

            addDisplayTotalAmount(friesMediumPrice.toDouble())
        }

        binding.friesLargePlusButton.setOnClickListener {
            friesLargeCount++
            binding.friesLargeCountTextView.text = "$friesLargeCount"

            addDisplayTotalAmount(friesLargePrice.toDouble())
        }

        binding.longganisaPlusButton.setOnClickListener {
            longganisaCount++
            binding.longganisaCountTextView.text = "$longganisaCount"

            addDisplayTotalAmount(longganisaPrice.toDouble())
        }

        //MINUS
        binding.sisilogMinusButton.setOnClickListener {
            if(sisilogCount == 0) return@setOnClickListener
            sisilogCount--
            binding.sisilogCountTextView.text = "$sisilogCount"

            minusDisplayTotalAmount(sisilogPrice.toDouble())
        }

        binding.steamedRiceMinusButton.setOnClickListener {
            if(steamedFriedRiceCount == 0) return@setOnClickListener
            steamedFriedRiceCount--
            binding.steamedRiceCountTextView.text = "$steamedFriedRiceCount"

            minusDisplayTotalAmount(steamedFriedRicePrice.toDouble())
        }

        binding.porkchopMinusButton.setOnClickListener {
            if(porkchopCount == 0) return@setOnClickListener
            porkchopCount--
            binding.porkchopCountTextView.text = "$porkchopCount"

            minusDisplayTotalAmount(porkchopPrice.toDouble())
        }

        binding.burgerstakeMinusButton.setOnClickListener {
            if(burgerSteakCount == 0) return@setOnClickListener
            burgerSteakCount--
            binding.burgerstakeCountTextView.text = "$burgerSteakCount"

            minusDisplayTotalAmount(burgerSteakCount.toDouble())
        }

        binding.siomaiRiceMinusButton.setOnClickListener {
            if(siomaiRiceCount == 0) return@setOnClickListener
            siomaiRiceCount--
            binding.siomaiRiceCountTextView.text = "$siomaiRiceCount"

            minusDisplayTotalAmount(siomaiRicePrice.toDouble())
        }

        binding.chickenStripsMinusButton.setOnClickListener {
            if(chickenStripsCount == 0) return@setOnClickListener
            chickenStripsCount--
            binding.chickenStripsCountTextView.text = "$chickenStripsCount"

            minusDisplayTotalAmount(chickenStripsPrice.toDouble())
        }

        binding.lumpiaMinusButton.setOnClickListener {
            if(lumpiaCount == 0) return@setOnClickListener
            lumpiaCount--
            binding.lumpiaCountTextView.text = "$lumpiaCount"

            minusDisplayTotalAmount(lumpiaPrice.toDouble())
        }

        binding.bbqRiceMinusButton.setOnClickListener {
            if(bbqRiceCount == 0) return@setOnClickListener
            bbqRiceCount--
            binding.bbqRiceCountTextView.text = "$bbqRiceCount"

            minusDisplayTotalAmount(bbqRicePrice.toDouble())
        }

        binding.tocinoWithEggMinusButton.setOnClickListener {
            if(tocinoWithEggCount == 0) return@setOnClickListener
            tocinoWithEggCount--
            binding.tocinoWithEggCountTextView.text = "$tocinoWithEggCount"

            minusDisplayTotalAmount(tocinoWithEggPrice.toDouble())
        }

        binding.tocinoWithoutEggMinusButton.setOnClickListener {
            if(tocinoWithoutEggCount == 0) return@setOnClickListener
            tocinoWithoutEggCount--
            binding.tocinoWithoutEggCountTextView.text = "$tocinoWithoutEggCount"

            minusDisplayTotalAmount(tocinoWithoutEggPrice.toDouble())
        }

        binding.chickenNuggetsMinusButton.setOnClickListener {
            if(chickenNuggetsCount == 0) return@setOnClickListener
            chickenNuggetsCount--
            binding.chickenNuggetsCountTextView.text = "$chickenNuggetsCount"

            minusDisplayTotalAmount(chickenNuggetsPrice.toDouble())
        }

        binding.javaRiceMinusButton.setOnClickListener {
            if(javaRiceCount == 0) return@setOnClickListener
            javaRiceCount--
            binding.javaRiceCountTextView.text = "$javaRiceCount"

            minusDisplayTotalAmount(javaRicePrice.toDouble())
        }

        binding.crispyBurgerMinusButton.setOnClickListener {
            if(crispyBurgerCount == 0) return@setOnClickListener
            crispyBurgerCount--
            binding.crispyBurgerCountTextView.text = "$crispyBurgerCount"

            minusDisplayTotalAmount(crispyBurgerPrice.toDouble())
        }

        //DRINKS

        binding.c2SmallMinusButton.setOnClickListener {
            if(c2SmallCount == 0) return@setOnClickListener
            c2SmallCount--
            binding.c2SmallCountTextView.text = "$c2SmallCount"

            minusDisplayTotalAmount(c2SmallPrice.toDouble())
        }

        binding.c2MediumMinusButton.setOnClickListener {
            if(c2MediumCount == 0) return@setOnClickListener
            c2MediumCount--
            binding.c2MediumCountTextView.text = "$c2MediumCount"

            minusDisplayTotalAmount(c2MediumPrice.toDouble())
        }

        binding.gulamanMinusButton.setOnClickListener {
            if(gulamanSmallCount == 0) return@setOnClickListener
            gulamanSmallCount--
            binding.gulamanCountTextView.text = "$gulamanSmallCount"

            minusDisplayTotalAmount(gulamanSmallPrice.toDouble())
        }

        binding.gulamanMediumMinusButton.setOnClickListener {
            if(gulamanMediumCount == 0) return@setOnClickListener
            gulamanMediumCount--
            binding.gulamanMediumCountTextView.text = "$gulamanMediumCount"

            minusDisplayTotalAmount(gulamanMediumPrice.toDouble())
        }

        binding.coffeeJellySmallMinusButton.setOnClickListener {
            if(coffeeJellySmallCount == 0) return@setOnClickListener
            coffeeJellySmallCount--
            binding.coffeeJellySmallCountTextView.text = "$coffeeJellySmallCount"

            minusDisplayTotalAmount(coffeeJellySmallPrice.toDouble())
        }

        binding.coffeeJellyMediumMinusButton.setOnClickListener {
            if(coffeeJellyMediumCount == 0) return@setOnClickListener
            coffeeJellyMediumCount--
            binding.coffeeJellyMediumCountTextView.text = "$coffeeJellyMediumCount"

            minusDisplayTotalAmount(coffeeJellyMediumPrice.toDouble())
        }

        binding.mangoTapiocaSmallMinusButton.setOnClickListener {
            if(mangoTapiocaSmallCount == 0) return@setOnClickListener
            mangoTapiocaSmallCount--
            binding.mangoTapiocaSmallCountTextView.text = "$mangoTapiocaSmallCount"

            minusDisplayTotalAmount(mangoTapiocaSmallPrice.toDouble())
        }

        binding.mangoTapiocaMediumMinusButton.setOnClickListener {
            if(mangoTapiocaMediumCount == 0) return@setOnClickListener
            mangoTapiocaMediumCount--
            binding.mangoTapiocaMediumCountTextView.text = "$mangoTapiocaMediumCount"

            minusDisplayTotalAmount(mangoTapiocaMediumPrice.toDouble())
        }

        binding.natureSprintSmallMinusButton.setOnClickListener {
            if(natureSpringSmallCount == 0) return@setOnClickListener
            natureSpringSmallCount--
            binding.natureSprintSmallCountTextView.text = "$natureSpringSmallCount"

            minusDisplayTotalAmount(natureSpringSmallPrice.toDouble())
        }

        binding.natureSprintMediumMinusButton.setOnClickListener {
            if(natureSpringMediumCount == 0) return@setOnClickListener
            natureSpringMediumCount--
            binding.natureSprintMediumCountTextView.text = "$natureSpringMediumCount"

            minusDisplayTotalAmount(natureSpringMediumPrice.toDouble())
        }

        binding.iceCoffeeMinusButton.setOnClickListener {
            if(icedCoffeeCount == 0) return@setOnClickListener
            icedCoffeeCount--
            binding.iceCoffeeCountTextView.text = "$icedCoffeeCount"

            minusDisplayTotalAmount(icedCoffeePrice.toDouble())
        }

        binding.icedTeaSmallMinusButton.setOnClickListener {
            if(icedTeaCount == 0) return@setOnClickListener
            icedTeaCount--
            binding.icedTeaSmallCountTextView.text = "$icedTeaCount"

            minusDisplayTotalAmount(icedTeaPrice.toDouble())
        }

        binding.vitamilkOriginalMinusButton.setOnClickListener {
            if(vitamilkOriginalCount == 0) return@setOnClickListener
            vitamilkOriginalCount--
            binding.vitamilkOriginalCountTextView.text = "$vitamilkOriginalCount"

            minusDisplayTotalAmount(vitamilkOriginalPrice.toDouble())
        }

        binding.vitamilkChocolateMinusButton.setOnClickListener {
            if(vitamilkChocolateCount == 0) return@setOnClickListener
            vitamilkChocolateCount--
            binding.vitamilkChocolateCountTextView.text = "$vitamilkChocolateCount"

            minusDisplayTotalAmount(vitamilkChocolatePrice.toDouble())
        }

        binding.vitamilkStrawberryMinusButton.setOnClickListener {
            if(vitamilkStrawberryCount == 0) return@setOnClickListener
            vitamilkStrawberryCount--
            binding.vitamilkStrawberryCountTextView.text = "$vitamilkStrawberryCount"

            minusDisplayTotalAmount(vitamilkStrawberryPrice.toDouble())
        }

        //SNACKS

        binding.luncheonMeatMinusButton.setOnClickListener {
            if(luncheonMeatCount == 0) return@setOnClickListener
            luncheonMeatCount--
            binding.luncheonMeatCountTextView.text = "$luncheonMeatCount"

            minusDisplayTotalAmount(luncheonMeatPrice.toDouble())
        }

        binding.nuggetsMinusButton.setOnClickListener {
            if(nuggetsCount == 0) return@setOnClickListener
            nuggetsCount--
            binding.nuggetsCountTextView.text = "$nuggetsCount"

            minusDisplayTotalAmount(nuggetsPrice.toDouble())
        }

        binding.kwekKwekMinusButton.setOnClickListener {
            if(kwekKwekCount == 0) return@setOnClickListener
            kwekKwekCount--
            binding.kwekKwekCountTextView.text = "$kwekKwekCount"

            minusDisplayTotalAmount(kwekKwekPrice.toDouble())
        }

        binding.friesSmallMinusButton.setOnClickListener {
            if(friesSmallCount == 0) return@setOnClickListener
            friesSmallCount--
            binding.friesSmallCountTextView.text = "$friesSmallCount"

            minusDisplayTotalAmount(friesSmallPrice.toDouble())
        }

        binding.friesMediumMinusButton.setOnClickListener {
            if(friesMediumCount == 0) return@setOnClickListener
            friesMediumCount--
            binding.friesMediumCountTextView.text = "$friesMediumCount"

            minusDisplayTotalAmount(friesMediumPrice.toDouble())
        }

        binding.friesLargeMinusButton.setOnClickListener {
            if(friesLargeCount == 0) return@setOnClickListener
            friesLargeCount--
            binding.friesLargeCountTextView.text = "$friesLargeCount"

            minusDisplayTotalAmount(friesLargePrice.toDouble())
        }

        binding.longganisaMinusButton.setOnClickListener {
            if(longganisaCount == 0) return@setOnClickListener
            longganisaCount--
            binding.longganisaCountTextView.text = "$longganisaCount"

            minusDisplayTotalAmount(longganisaPrice.toDouble())
        }

        binding.cancelImageButton.setOnClickListener {
            finish()
        }

        binding.checkoutImageButton.setOnClickListener {
            val itemCountArray = mutableListOf<Int>()
            val itemNameArray = mutableListOf<String>()

            itemCountArray.add(sisilogCount)
            itemCountArray.add(steamedFriedRiceCount)
            itemCountArray.add(porkchopCount)
            itemCountArray.add(burgerSteakCount)
            itemCountArray.add(chickenStripsCount)
            itemCountArray.add(siomaiRiceCount)
            itemCountArray.add(lumpiaCount)
            itemCountArray.add(bbqRiceCount)
            itemCountArray.add(tocinoWithEggCount)
            itemCountArray.add(tocinoWithoutEggCount)
            itemCountArray.add(chickenNuggetsCount)
            itemCountArray.add(javaRiceCount)
            itemCountArray.add(crispyBurgerCount)

            itemCountArray.add(c2SmallCount)
            itemCountArray.add(c2MediumCount)
            itemCountArray.add(gulamanSmallCount)
            itemCountArray.add(gulamanMediumCount)
            itemCountArray.add(coffeeJellySmallCount)
            itemCountArray.add(coffeeJellyMediumCount)
            itemCountArray.add(mangoTapiocaSmallCount)
            itemCountArray.add(mangoTapiocaMediumCount)
            itemCountArray.add(natureSpringSmallCount)
            itemCountArray.add(natureSpringMediumCount)
            itemCountArray.add(icedCoffeeCount)
            itemCountArray.add(icedTeaCount)
            itemCountArray.add(vitamilkOriginalCount)
            itemCountArray.add(vitamilkChocolateCount)
            itemCountArray.add(vitamilkStrawberryCount)

            itemCountArray.add(luncheonMeatCount)
            itemCountArray.add(nuggetsCount)
            itemCountArray.add(kwekKwekCount)
            itemCountArray.add(friesSmallCount)
            itemCountArray.add(friesMediumCount)
            itemCountArray.add(friesLargeCount)
            itemCountArray.add(longganisaCount)

            itemNameArray.add(sisilogName)
            itemNameArray.add(steamedFriedRiceName)
            itemNameArray.add(porkchopName)
            itemNameArray.add(burgerSteakName)
            itemNameArray.add(chickenStripsName)
            itemNameArray.add(siomaiName)
            itemNameArray.add(lumpiaName)
            itemNameArray.add(bbqRiceName)
            itemNameArray.add(tocinoWithEggName)
            itemNameArray.add(tocinoWithoutEggName)
            itemNameArray.add(chickenNuggetsName)
            itemNameArray.add(javaRiceName)
            itemNameArray.add(crispyBurgerName)

            itemNameArray.add(c2SmallName)
            itemNameArray.add(c2MediumName)
            itemNameArray.add(gulamanSmallName)
            itemNameArray.add(gulamanMediumName)
            itemNameArray.add(coffeeJellySmallName)
            itemNameArray.add(coffeeJellyMediumName)
            itemNameArray.add(mangoTapiocaSmallName)
            itemNameArray.add(mangoTapiocaMediumName)
            itemNameArray.add(natureSpringSmallName)
            itemNameArray.add(natureSpringMediumName)
            itemNameArray.add(icedCoffeeName)
            itemNameArray.add(icedTeaName)
            itemNameArray.add(vitamilkOriginalName)
            itemNameArray.add(vitamilkChocolateName)
            itemNameArray.add(vitamilkStrawberryName)

            itemNameArray.add(luncheonMeatName)
            itemNameArray.add(nuggetsName)
            itemNameArray.add(kwekKwekName)
            itemNameArray.add(friesSmallName)
            itemNameArray.add(friesMediumName)
            itemNameArray.add(friesLargeName)
            itemNameArray.add(longganisaName)

            processOrders(itemCountArray, itemNameArray)
            startActivity(Intent(this@OrderListViewActivity, CheckoutActivity::class.java))
            finish()
        }

    }

    @SuppressLint("SetTextI18n")
    fun addDisplayTotalAmount(value: Double) {
        totalAmount += value
        binding.totalAmountTextView.text = "TOTAL AMOUNT: $totalAmount php"
    }

    @SuppressLint("SetTextI18n")
    fun minusDisplayTotalAmount(value: Double) {
        totalAmount -= value
        binding.totalAmountTextView.text = "TOTAL AMOUNT: $totalAmount php"
    }

    private fun processOrders(counts: List<Int>, names: List<String>): List<String> {
        for (index in counts.indices) {
            if (counts[index] != 0) {
                orderList.add("${names[index]}: ${counts[index]}")
            }
        }

        return orderList
    }

}