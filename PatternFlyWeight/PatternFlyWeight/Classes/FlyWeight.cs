using Newtonsoft.Json;

namespace PatternFlyWeight.Classes
{
    public class FlyWeight
    {
        private Car _sharedState;

        public FlyWeight(Car car)
        {
            this._sharedState = car;
        }

        public void Operation(Car uniqueState)
        {
            string s = JsonConvert.SerializeObject(this._sharedState);
            string u = JsonConvert.SerializeObject(uniqueState);
            Console.WriteLine($"Flyweight: Displaying shared {s} and unique {u} state.");
        }
    }
}
