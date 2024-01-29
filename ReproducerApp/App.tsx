import * as React from 'react';
import {Text, View, StyleSheet} from 'react-native';
import {LocalModuleView} from 'react-native-local-module';

const App = () => {
  return (
    <View style={styles.container}>
      <Text>App</Text>
      <LocalModuleView
        style={{width: 200, height: 200}}
        color={'blue'}
        onColorChanged={() => console.log('onColorChange')}
      />
    </View>
  );
};

export default App;

const styles = StyleSheet.create({
  container: {},
});
