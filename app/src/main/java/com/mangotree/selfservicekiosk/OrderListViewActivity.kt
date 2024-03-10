package com.mangotree.selfservicekiosk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mangotree.selfservicekiosk.databinding.ActivityOrderListViewBinding

class OrderListViewActivity : AppCompatActivity() {

    private lateinit var binding: ActivityOrderListViewBinding

    var totalAmount = 0.0

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

    companion object {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOrderListViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //PLUS
        binding.sisilogPlusButton.setOnClickListener {
            sisilogCount++
            binding.sisilogCountTextView.text = "$sisilogCount"
        }

        binding.steamedRicePlusButton.setOnClickListener {
            steamedFriedRiceCount++
            binding.steamedRiceCountTextView.text = "$steamedFriedRiceCount"
        }

        binding.porkchopPlusButton.setOnClickListener {
            porkchopCount++
            binding.porkchopCountTextView.text = "$porkchopCount"
        }

        binding.burgerstakePlusButton.setOnClickListener {
            burgerSteakCount++
            binding.burgerstakeCountTextView.text = "$burgerSteakCount"
        }

        binding.siomaiRicePlusButton.setOnClickListener {
            siomaiRiceCount++
            binding.siomaiRiceCountTextView.text = "$siomaiRiceCount"
        }

        binding.chickenStripsPlusButton.setOnClickListener {
            chickenStripsCount++
            binding.chickenStripsCountTextView.text = "$chickenStripsCount"
        }

        binding.lumpiaPlusButton.setOnClickListener {
            lumpiaCount++
            binding.lumpiaCountTextView.text = "$lumpiaCount"
        }

        binding.bbqRicePlusButton.setOnClickListener {
            bbqRiceCount++
            binding.bbqRiceCountTextView.text = "$bbqRiceCount"
        }

        binding.tocinoWithEggPlusButton.setOnClickListener {
            tocinoWithEggCount++
            binding.tocinoWithEggCountTextView.text = "$tocinoWithEggCount"
        }

        binding.tocinoWithoutEggPlusButton.setOnClickListener {
            tocinoWithoutEggCount++
            binding.tocinoWithoutEggCountTextView.text = "$tocinoWithoutEggCount"
        }

        binding.chickenNuggetsPlusButton.setOnClickListener {
            chickenNuggetsCount++
            binding.chickenNuggetsCountTextView.text = "$chickenNuggetsCount"
        }

        binding.javaRicePlusButton.setOnClickListener {
            javaRiceCount++
            binding.javaRiceCountTextView.text = "$javaRiceCount"
        }

        binding.crispyBurgerPlusButton.setOnClickListener {
            crispyBurgerCount++
            binding.crispyBurgerCountTextView.text = "$crispyBurgerCount"
        }

        //DRINKS

        binding.c2SmallPlusButton.setOnClickListener {
            c2SmallCount++
            binding.c2SmallCountTextView.text = "$c2SmallCount"
        }

        binding.c2MediumPlusButton.setOnClickListener {
            c2MediumCount++
            binding.c2MediumCountTextView.text = "$c2MediumCount"
        }

        binding.gulamanPlusButton.setOnClickListener {
            gulamanSmallCount++
            binding.gulamanCountTextView.text = "$gulamanSmallCount"
        }

        binding.gulamanMediumPlusButton.setOnClickListener {
            gulamanMediumCount++
            binding.gulamanMediumCountTextView.text = "$gulamanMediumCount"
        }

        binding.coffeeJellySmallPlusButton.setOnClickListener {
            coffeeJellySmallCount++
            binding.coffeeJellySmallCountTextView.text = "$coffeeJellySmallCount"
        }

        binding.coffeeJellyMediumPlusButton.setOnClickListener {
            coffeeJellyMediumCount++
            binding.coffeeJellyMediumCountTextView.text = "$coffeeJellyMediumCount"
        }

        binding.mangoTapiocaSmallPlusButton.setOnClickListener {
            mangoTapiocaSmallCount++
            binding.mangoTapiocaSmallCountTextView.text = "$mangoTapiocaSmallCount"
        }

        binding.mangoTapiocaMediumPlusButton.setOnClickListener {
            mangoTapiocaMediumCount++
            binding.mangoTapiocaMediumCountTextView.text = "$mangoTapiocaMediumCount"
        }

        binding.natureSprintSmallPlusButton.setOnClickListener {
            natureSpringSmallCount++
            binding.natureSprintSmallCountTextView.text = "$natureSpringSmallCount"
        }

        binding.natureSprintMediumPlusButton.setOnClickListener {
            natureSpringMediumCount++
            binding.natureSprintMediumCountTextView.text = "$natureSpringMediumCount"
        }

        binding.iceCoffeePlusButton.setOnClickListener {
            icedCoffeeCount++
            binding.iceCoffeeCountTextView.text = "$icedCoffeeCount"
        }

        binding.icedTeaSmallPlusButton.setOnClickListener {
            icedTeaCount++
            binding.icedTeaSmallCountTextView.text = "$icedTeaCount"
        }

        binding.vitamilkOriginalPlusButton.setOnClickListener {
            vitamilkOriginalCount++
            binding.vitamilkOriginalCountTextView.text = "$vitamilkOriginalCount"
        }

        binding.vitamilkChocolatePlusButton.setOnClickListener {
            vitamilkChocolateCount++
            binding.vitamilkChocolateCountTextView.text = "$vitamilkChocolateCount"
        }

        binding.vitamilkStrawberryPlusButton.setOnClickListener {
            vitamilkStrawberryCount++
            binding.vitamilkStrawberryCountTextView.text = "$vitamilkStrawberryCount"
        }

        //SNACKS

        binding.luncheonMeatPlusButton.setOnClickListener {
            luncheonMeatCount++
            binding.luncheonMeatCountTextView.text = "$luncheonMeatCount"
        }

        binding.nuggetsPlusButton.setOnClickListener {
            nuggetsCount++
            binding.nuggetsCountTextView.text = "$nuggetsCount"
        }

        binding.kwekKwekPlusButton.setOnClickListener {
            kwekKwekCount++
            binding.kwekKwekCountTextView.text = "$kwekKwekCount"
        }

        binding.friesSmallPlusButton.setOnClickListener {
            friesSmallCount++
            binding.friesSmallCountTextView.text = "$friesSmallCount"
        }

        binding.friesMediumPlusButton.setOnClickListener {
            friesMediumCount++
            binding.friesMediumCountTextView.text = "$friesMediumCount"
        }

        binding.friesLargePlusButton.setOnClickListener {
            friesLargeCount++
            binding.friesLargeCountTextView.text = "$friesLargeCount"
        }

        binding.longganisaPlusButton.setOnClickListener {
            longganisaCount++
            binding.longganisaCountTextView.text = "$longganisaCount"
        }

        //MINUS
        binding.sisilogMinusButton.setOnClickListener {
            if(sisilogCount == 0) return@setOnClickListener
            sisilogCount--
            binding.sisilogCountTextView.text = "$sisilogCount"
        }

        binding.steamedRiceMinusButton.setOnClickListener {
            if(steamedFriedRiceCount == 0) return@setOnClickListener
            steamedFriedRiceCount--
            binding.steamedRiceCountTextView.text = "$steamedFriedRiceCount"
        }

        binding.porkchopMinusButton.setOnClickListener {
            if(porkchopCount == 0) return@setOnClickListener
            porkchopCount--
            binding.porkchopCountTextView.text = "$porkchopCount"
        }

        binding.burgerstakeMinusButton.setOnClickListener {
            if(porkchopCount == 0) return@setOnClickListener
            porkchopCount--
            binding.burgerstakeCountTextView.text = "$porkchopCount"
        }

        binding.siomaiRiceMinusButton.setOnClickListener {
            if(siomaiRiceCount == 0) return@setOnClickListener
            siomaiRiceCount--
            binding.siomaiRiceCountTextView.text = "$siomaiRiceCount"
        }

        binding.chickenStripsMinusButton.setOnClickListener {
            if(chickenStripsCount == 0) return@setOnClickListener
            chickenStripsCount--
            binding.chickenStripsCountTextView.text = "$chickenStripsCount"
        }

        binding.lumpiaMinusButton.setOnClickListener {
            if(lumpiaCount == 0) return@setOnClickListener
            lumpiaCount--
            binding.lumpiaCountTextView.text = "$lumpiaCount"
        }

        binding.bbqRiceMinusButton.setOnClickListener {
            if(bbqRiceCount == 0) return@setOnClickListener
            bbqRiceCount--
            binding.bbqRiceCountTextView.text = "$bbqRiceCount"
        }

        binding.tocinoWithEggMinusButton.setOnClickListener {
            if(tocinoWithEggCount == 0) return@setOnClickListener
            tocinoWithEggCount--
            binding.tocinoWithEggCountTextView.text = "$tocinoWithEggCount"
        }

        binding.tocinoWithoutEggMinusButton.setOnClickListener {
            if(tocinoWithoutEggCount == 0) return@setOnClickListener
            tocinoWithoutEggCount--
            binding.tocinoWithoutEggCountTextView.text = "$tocinoWithoutEggCount"
        }

        binding.chickenNuggetsMinusButton.setOnClickListener {
            if(chickenNuggetsCount == 0) return@setOnClickListener
            chickenNuggetsCount--
            binding.chickenNuggetsCountTextView.text = "$chickenNuggetsCount"
        }

        binding.javaRiceMinusButton.setOnClickListener {
            if(javaRiceCount == 0) return@setOnClickListener
            javaRiceCount--
            binding.javaRiceCountTextView.text = "$javaRiceCount"
        }

        binding.crispyBurgerMinusButton.setOnClickListener {
            if(crispyBurgerCount == 0) return@setOnClickListener
            crispyBurgerCount--
            binding.crispyBurgerCountTextView.text = "$crispyBurgerCount"
        }

        //DRINKS

        binding.c2SmallMinusButton.setOnClickListener {
            if(c2SmallCount == 0) return@setOnClickListener
            c2SmallCount--
            binding.c2SmallCountTextView.text = "$c2SmallCount"
        }

        binding.c2MediumMinusButton.setOnClickListener {
            if(c2MediumCount == 0) return@setOnClickListener
            c2MediumCount--
            binding.c2MediumCountTextView.text = "$c2MediumCount"
        }

        binding.gulamanMinusButton.setOnClickListener {
            if(gulamanSmallCount == 0) return@setOnClickListener
            gulamanSmallCount--
            binding.gulamanCountTextView.text = "$gulamanSmallCount"
        }

        binding.gulamanMediumMinusButton.setOnClickListener {
            if(gulamanMediumCount == 0) return@setOnClickListener
            gulamanMediumCount--
            binding.gulamanMediumCountTextView.text = "$gulamanMediumCount"
        }

        binding.coffeeJellySmallMinusButton.setOnClickListener {
            if(coffeeJellySmallCount == 0) return@setOnClickListener
            coffeeJellySmallCount--
            binding.coffeeJellySmallCountTextView.text = "$coffeeJellySmallCount"
        }

        binding.coffeeJellyMediumMinusButton.setOnClickListener {
            if(coffeeJellyMediumCount == 0) return@setOnClickListener
            coffeeJellyMediumCount--
            binding.coffeeJellyMediumCountTextView.text = "$coffeeJellyMediumCount"
        }

        binding.mangoTapiocaSmallMinusButton.setOnClickListener {
            if(mangoTapiocaSmallCount == 0) return@setOnClickListener
            mangoTapiocaSmallCount--
            binding.mangoTapiocaSmallCountTextView.text = "$mangoTapiocaSmallCount"
        }

        binding.mangoTapiocaMediumMinusButton.setOnClickListener {
            if(mangoTapiocaMediumCount == 0) return@setOnClickListener
            mangoTapiocaMediumCount--
            binding.mangoTapiocaMediumCountTextView.text = "$mangoTapiocaMediumCount"
        }

        binding.natureSprintSmallMinusButton.setOnClickListener {
            if(sisilogCount == 0) return@setOnClickListener
            natureSpringSmallCount--
            binding.natureSprintSmallCountTextView.text = "$natureSpringSmallCount"
        }

        binding.natureSprintMediumMinusButton.setOnClickListener {
            if(natureSpringMediumCount == 0) return@setOnClickListener
            natureSpringMediumCount--
            binding.natureSprintMediumCountTextView.text = "$natureSpringMediumCount"
        }

        binding.iceCoffeeMinusButton.setOnClickListener {
            if(icedCoffeeCount == 0) return@setOnClickListener
            icedCoffeeCount--
            binding.iceCoffeeCountTextView.text = "$icedCoffeeCount"
        }

        binding.icedTeaSmallMinusButton.setOnClickListener {
            if(icedTeaCount == 0) return@setOnClickListener
            icedTeaCount--
            binding.icedTeaSmallCountTextView.text = "$icedTeaCount"
        }

        binding.vitamilkOriginalMinusButton.setOnClickListener {
            if(vitamilkOriginalCount == 0) return@setOnClickListener
            vitamilkOriginalCount--
            binding.vitamilkOriginalCountTextView.text = "$vitamilkOriginalCount"
        }

        binding.vitamilkChocolateMinusButton.setOnClickListener {
            if(vitamilkChocolateCount == 0) return@setOnClickListener
            vitamilkChocolateCount--
            binding.vitamilkChocolateCountTextView.text = "$vitamilkChocolateCount"
        }

        binding.vitamilkStrawberryMinusButton.setOnClickListener {
            if(vitamilkStrawberryCount == 0) return@setOnClickListener
            vitamilkStrawberryCount--
            binding.vitamilkStrawberryCountTextView.text = "$vitamilkStrawberryCount"
        }

        //SNACKS

        binding.luncheonMeatMinusButton.setOnClickListener {
            if(luncheonMeatCount == 0) return@setOnClickListener
            luncheonMeatCount--
            binding.luncheonMeatCountTextView.text = "$luncheonMeatCount"
        }

        binding.nuggetsMinusButton.setOnClickListener {
            if(nuggetsCount == 0) return@setOnClickListener
            nuggetsCount--
            binding.nuggetsCountTextView.text = "$nuggetsCount"
        }

        binding.kwekKwekMinusButton.setOnClickListener {
            if(kwekKwekCount == 0) return@setOnClickListener
            kwekKwekCount--
            binding.kwekKwekCountTextView.text = "$kwekKwekCount"
        }

        binding.friesSmallMinusButton.setOnClickListener {
            if(friesSmallCount == 0) return@setOnClickListener
            friesSmallCount--
            binding.friesSmallCountTextView.text = "$friesSmallCount"
        }

        binding.friesMediumMinusButton.setOnClickListener {
            if(friesMediumCount == 0) return@setOnClickListener
            friesMediumCount--
            binding.friesMediumCountTextView.text = "$friesMediumCount"
        }

        binding.friesLargeMinusButton.setOnClickListener {
            if(friesLargeCount == 0) return@setOnClickListener
            friesLargeCount--
            binding.friesLargeCountTextView.text = "$friesLargeCount"
        }

        binding.longganisaMinusButton.setOnClickListener {
            if(longganisaCount == 0) return@setOnClickListener
            longganisaCount--
            binding.longganisaCountTextView.text = "$longganisaCount"
        }

    }

    fun checkoutCalculation() {

    }

    fun displayTotalAmount() {

    }

}